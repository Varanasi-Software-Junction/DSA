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
        
//        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        System.out.println("Enter message");
        String data = s.nextLine();
        out.writeObject(data);
//        System.out.println("Hello from Client");
        out.flush();
        out.close();

    }
}
