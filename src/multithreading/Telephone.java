package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Telephone {

    public String phoneumber, owner;

    public Telephone(String phoneumber, String owner) {
        this.phoneumber = phoneumber;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Telephone{" + "phoneumber=" + phoneumber + ", owner=" + owner + '}';
    }

}
