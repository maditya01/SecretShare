package SERVER;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Server {
     String user = "root";
     String password = "Mysql@7881";
     String url = "jdbc:mysql://localhost:3306";

    public static void main(String[] args) throws IOException, SQLException {
        Server server  = new Server();
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
            System.out.println("User.Client Arrived :)");
            LoginSignUp handle = new LoginSignUp(s,con);
            System.out.println("Remember what is happening with server. Thread is creating");
            Thread thread = new Thread(handle);
            thread.start();
        }
    }
}

