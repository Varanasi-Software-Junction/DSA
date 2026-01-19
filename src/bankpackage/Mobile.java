
package bankpackage;


public class Mobile {
    private String number;
    private String countrycode;

    public Mobile(String number, String countrycode) {
        this.number = number;
        this.countrycode = countrycode;
    }

    @Override
    public String toString() {
        return "Mobile{" + "number=" + number + ", countrycode=" + countrycode + '}';
    }

}
