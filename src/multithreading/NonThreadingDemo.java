package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NonThreadingDemo {

    public static void main(String[] args) {
        NonThreadingDemo t1 = new NonThreadingDemo();
        t1.run();
        t1.run();
    }

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
