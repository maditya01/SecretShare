package sample;

import ClientBackend.ClientAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignUp {
    public Button submitBtn;
    @FXML Label msgLabel;
    @FXML PasswordField cnfPassField;
    @FXML PasswordField passField;
    @FXML TextField idField;
    @FXML TextField emailField;
    @FXML TextField nameField;

    ClientAction clientAction;

    public void submitAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Inside submitAction Handler");
        String name;
        String pass;
        String cnfpass;
        String email;
        String id;
        boolean b;
            name =nameField.getText();
            pass = passField.getText();
            cnfpass = cnfPassField.getText();
            email = emailField.getText();
            id = idField.getText();
            /*if(!cnfpass.equals(pass)) {
                msgLabel.setText("Password Confirm not matched, try again.");
                continue;
            }*/
            //client.signUp();
            System.out.println(name+" "+pass+" "+email+" "+id + "\n"+"Inside submit action handler");
            b = clientAction.signUp(name,id,email,pass);
            System.out.println(b + " client signup value");
          //while (!());
          if(b) msgLabel.setText("Registered Successfully");
          else msgLabel.setText("UserID is occupied already. Please try another user name.");
    }
}
