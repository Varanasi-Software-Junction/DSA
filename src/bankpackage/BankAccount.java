package bankpackage;

public class BankAccount {

    private Person accountholder;
    private int balance;
    private String accountno;

    public void deposit(int amount) {
        this.balance += amount;

    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountholder=" + accountholder + ", balance=" + balance + ", accoutno=" + accountno + '}';
    }

    public BankAccount(Person accountholder, int balance, String accountno) {
        this.accountholder = accountholder;
        this.balance = balance;
        this.accountno = accountno;
    }

}
