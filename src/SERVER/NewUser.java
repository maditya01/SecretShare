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
        this.userName = name;
        this.userID = id;
        this.email = mail;
        this.pass = pass;
        Password p = new Password(pass);
        String str = " insert into userinfo (userId, userName, email, password)" + " values (?, ?, ?, ?) ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(str);
        } catch (SQLException throwables) {
            throwables.getMessage();
        }
        ps.setString(1,id);
        ps.setString(2,name);
        ps.setString(3,mail);
        ps.setString(4,p.getHash());
        /* Here I have added try catch block*/
//        System.out.println("Inside try block!!!");
        boolean b = ps.execute();  //Problem is here.
        System.out.println("registered!!!");
        return true;
    }
}
