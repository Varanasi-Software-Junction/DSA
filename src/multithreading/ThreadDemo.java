/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo implements Runnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

}
