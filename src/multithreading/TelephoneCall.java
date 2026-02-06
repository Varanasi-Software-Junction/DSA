package multithreading;

public class TelephoneCall extends Thread {

    Telephone t1, t2;

    public TelephoneCall(Telephone t1, Telephone t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public synchronized void run() {

        for (int i = 1; i <= 20; i++) {

            try {
                System.out.printf("\n%s talking to %s time %s\n", t1.owner, t2.owner, i);
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        System.out.printf("\n%s call over  to %s \n", t1.owner, t2.owner);
    }
}
