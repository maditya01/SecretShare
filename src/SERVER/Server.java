package SERVER;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Server {

     String user="root";
     String password="root";
     String url="jdbc:mysql://localhost:3306/smartshare";

    public static void main(String[] args) throws IOException, SQLException {
        Server server  = new Server();
//        FileInputStream fis = new FileInputStream("C:/Code/Java Code/projects/SecretShare/abc.properties");
//        Properties p = new Properties();
//        p.load(fis);
//        server.user = p.getProperty("user");
//        server.password = p.getProperty("password");
//        server.url = p.getProperty("url");
        System.out.println(server.user+" "+server.password+" "+server.url);
        Connection con = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(server.url, server.user, server.password);
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

