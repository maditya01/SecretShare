package ClientBackend;

import java.io.IOException;
import java.net.Socket;

public class ClientAction extends NewClient {

    public ClientAction() throws IOException {
        super();
    }
    public ClientAction(Socket s) throws IOException{
        super(s);
    }

    public Socket getSocket() {
        return this.socket;
    }
    public boolean signUp(String name, String id ,String email, String pass) throws IOException {
        System.out.println("Inside signUp handler");
        dout.writeUTF("SIGNUP");//This value is used as choice in server.
        dout.writeUTF(name);
        dout.flush();
        System.out.println("After dout 1");
        dout.writeUTF(id);
        dout.flush();
        System.out.println("After dout 2");
        dout.writeUTF(email);
        dout.flush();
        dout.writeUTF(pass);
        dout.flush();
        System.out.println("After dout 3");
        boolean b = din.readBoolean();
        System.out.println("After dout 4");
        return b;
    }

    public boolean login(String userId, String pass) throws IOException {
        dout.writeUTF("LOGIN");
        dout.flush();
        dout.writeUTF(userId);
        dout.flush();
        dout.writeUTF(pass);
        dout.flush();
        return (din.readBoolean());
    }

    public void exit() throws IOException {
        socket.close();
    }
}
