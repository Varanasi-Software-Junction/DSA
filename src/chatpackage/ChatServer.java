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
        ServerSocket ss = new ServerSocket(777);
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Waiting for connection");
            Socket socket = ss.accept();
            System.out.println("Connected");
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
while(true)
{
            String data = (String) in.readObject();
            System.out.printf(" %s\n", data);
            System.out.println("Enter message");
            data = s.nextLine();
            out.writeObject("From server" + data);
            out.flush();
}

        }
    }
}
