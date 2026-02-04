/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SynchronizedDemo implements Runnable {

    private int delay;
    private String name;

    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            Thread th1 = new Thread(new SynchronizedDemo(i * 25, "" + i));

            th1.start();
        }

    }

    public SynchronizedDemo(int delay, String name) {
        this.delay = delay;
        this.name = name;
    }

    public synchronized static void runLoop(String name, int delay) {
        System.out.printf("%s waiting in loop\n", name);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s:%s\n", name, i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.printf("%s leaving loop\n", name);
    }

    @Override
    public void run() {
        System.out.printf("%s started\n", name);
        runLoop(name, delay);
        System.out.printf("%s done\n", name);
    }
}
