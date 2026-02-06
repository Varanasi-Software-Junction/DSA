/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Client");
        String ip = "192.168.1.6";
//        String ip="127.0.0.1";
        Socket socket = new Socket(ip, 777);

//        
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ReadClient client = new ReadClient(socket.getInputStream());
        client.start();
        while (true) {
            System.out.println("Enter  client  message");
            String data = s.nextLine();
            out.writeObject(data);
//        System.out.println("Hello from Client");
            out.flush();

        }

    }
}
