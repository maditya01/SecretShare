package ClientBackend;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class NewClient {
    Socket socket = new Socket();
    DataInputStream din;
    DataOutputStream dout;

    public NewClient() throws  IOException{
        socket = new Socket("localhost",5128);
        din = new DataInputStream(socket.getInputStream());
        dout = new DataOutputStream(socket.getOutputStream());
    }
    public NewClient(Socket s) throws IOException {
        this.socket = s;
        din = new DataInputStream(s.getInputStream());
        dout = new DataOutputStream(s.getOutputStream());
    }
}
