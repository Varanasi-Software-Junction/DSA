package bankpackage;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        int amount;
        Scanner scanner = new Scanner(System.in);
        Mobile mob = new Mobile("9335874326", "+91");
        Person p = new Person("MS Dhoni", "Ranchi", mob, 40);
        BankAccount ba = new BankAccount(p, 1000, "101");
        System.out.println(ba);
        while (true) {
            System.out.println("0-Exit, 1=Deposit, 2-Withdraw, 3-Show");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.println("Enter amount to deposit");
                    amount = Integer.parseInt(scanner.nextLine());
                    ba.deposit(amount);
                    continue;

                case 2:
                    System.out.println("Enter amount to withdraw");
                    amount = Integer.parseInt(scanner.nextLine());
                    ba.withdraw(amount);
                    continue;
                case 3:
                    System.out.println(ba);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }

    }
}
