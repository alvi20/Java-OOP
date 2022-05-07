import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket servesockt=new ServerSocket(4744);

            Socket sock=servesockt.accept();

            DataInputStream dis=new DataInputStream(sock.getInputStream());

            System.out.println("Message from client: "+dis.readUTF());
            servesockt.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}