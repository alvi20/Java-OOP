import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
       String serveIP="localhost";
       int serveport=4744;
        try {
            Socket sock=new Socket(serveIP,serveport);

            DataOutputStream dos=new DataOutputStream(sock.getOutputStream());

            dos.writeUTF("Hello Client");
            dos.flush();
            dos.close();
            sock.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
