package multithreading;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadLifeCycle implements Runnable {

    @Override
    public void run() {
        for (int i = 0;; i++) {

            try {
                System.out.print(i + ",");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        Thread th = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n0-Exit, 1-Start ,2-Stop, 3-suspend, 4-resume");
        while (true) {

            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                  System.exit(0);
                    return;
                case 1:
                    try {
                        th.stop();
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    th = new Thread(new ThreadLifeCycle());
                    th.start();
                    break;
                case 2:
                    th.stop();
                    break;
                case 3:
                    th.suspend();
                    break;
                case 4:
                    th.resume();
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }

        }
    }
}
