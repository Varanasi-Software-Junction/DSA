package multithreading;

public class TelephoneExchange {
    
    public static void doCall(TelephoneCall call) {
        System.out.printf("\n%s dialling %s  \n", call.t1.owner, call.t2.owner);
        call.start();
        
    }
    
    public static void main(String[] args) {
        Telephone[] telephones = {new Telephone("9335874326", "Champak"), new Telephone("6390295270", "Piyush"), new Telephone("7985439176", "Avinash"), new Telephone("9793775583", "Ashish"), new Telephone("9250388496", "Aryan")};
        TelephoneCall call1 = new TelephoneCall(telephones[0], telephones[1]);
        TelephoneCall call2 = new TelephoneCall(telephones[2], telephones[1]);
        TelephoneCall call3 = new TelephoneCall(telephones[4], telephones[3]);
        doCall(call1);
        doCall(call2);
        doCall(call3);
        
    }
}
