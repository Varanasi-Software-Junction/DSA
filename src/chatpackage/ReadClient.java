package chatpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadClient extends Thread {

    ObjectInputStream in;

    public ReadClient(InputStream is) throws Exception {
        this.in = new ObjectInputStream(is);
    }

    @Override
    public void run() {
        while (true) {

            try {
                String data = (String) in.readObject();
                System.out.printf(" %s\n", data);
            } catch (Exception ex) {

                System.out.println(ex);

            }
        }

    }
}
