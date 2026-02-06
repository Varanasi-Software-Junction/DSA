package chatpackage;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

    public static void main(String[] args) throws Exception {
        System.out.println("Server");
        String data;
        ServerSocket ss = new ServerSocket(777);
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Waiting for connection");
            Socket socket = ss.accept();
            System.out.println("Connected");
            ReadClient client = new ReadClient(socket.getInputStream());
            client.start();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            while (true) {

                System.out.println("Enter message\n");
                data = s.nextLine();
                out.writeObject("From server  " + data);
                out.flush();
            }

        }
    }
}
