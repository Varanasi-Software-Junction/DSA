/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinDemo implements Runnable {

    private int delay;
    private String name;

    public static void main(String[] args) {
        Thread th1 = new Thread(new JoinDemo(500, "Batti cooking "));
        Thread th2 = new Thread(new JoinDemo(1000, "Chokha making"));
        th1.start();
        th2.start();
        try {
            th1.join();

            th2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Start eating");
    }

    public JoinDemo(int delay, String name) {
        this.delay = delay;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s started\n", name);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s:%s\n", name, i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.printf("%s done\n", name);
    }
}
