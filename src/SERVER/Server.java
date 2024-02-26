package SERVER;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.Properties;

public class Server {

     String user;
     String password;
     String url;

    public static void main(String[] args) throws IOException, SQLException {
        FileInputStream fis = new FileInputStream("abc.properties");
        Properties p = new Properties();
        p.load(fis);
        Server server  = new Server();
        server.user = p.getProperty("user");
        server.password = p.getProperty("password");
        server.url = p.getProperty("url");
        Connection con = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartshare", server.user, server.password);
            System.out.println(con);
            System.out.println("..Database connection established..");
        } catch (Exception e) {
            System.out.println("Exception in database connection: " + e.getMessage());
            e.printStackTrace();
        }
        ServerSocket ss = new ServerSocket(5128);
        System.out.println("Server Created");
        while (true) {
            System.out.println("Waiting for client..");
            Socket s = ss.accept();
            System.out.println("Accepted a client request...");
            LoginSignUp handle = new LoginSignUp(s,con);
            System.out.println("Create a thread for each connection....");
            Thread thread = new Thread(handle);
            thread.start();
        }
    }
}

