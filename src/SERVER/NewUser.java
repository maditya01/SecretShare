package SERVER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewUser {
    private String userID , userName, email, pass;
    Connection con;
    public NewUser( Connection con ) {
        this.con = con;
    }

    public boolean registerUser(String name, String id, String mail, String pass) throws SQLException {
        System.out.println("Inside registerUser handler");
        this.userName = name;
        this.userID = id;
        this.email = mail;
        this.pass = pass;
        Password p = new Password(pass);
        System.out.println("Password created.."+p.getHash() );
        System.out.println("Storing into database !!!");
        String str = " insert into userinfo (userId, userName, email, password)" + " values (?, ?, ?, ?) ";
        System.out.println("Stored" + str);
        PreparedStatement ps = null;
        try {
            System.out.println(ps +"prepared statement");
            ps = con.prepareStatement(str);
        } catch (SQLException throwables) {
            System.out.println("Catch error");
            throwables.getMessage();
        }
        ps.setString(1,id);
        ps.setString(2,name);
        ps.setString(3,mail);
        ps.setString(4,p.getHash());
        System.out.println(ps);
        /* Here I have added try catch block*/
        System.out.println("Inside try block!!!");
        boolean b = ps.execute();  //Problem is here.
        System.out.println(b);
        System.out.println("registered!!!");
        return true;
    }
}
