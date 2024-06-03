package bankheritance;

import account.BankAccount;
import account.CheckingAccount;
import account.SavingAccount;

public class BankHeritance {

    public static void main(String[] args) {
        BankAccount sa = new SavingAccount(100, 0.5);
        BankAccount ca = new CheckingAccount(2000, 500, 10);
        System.out.println("Savings Account:");
        System.out.println("Initial Balance: " + sa.balance);
        sa.deposit(500);
        System.out.println("Balance after deposit: " + sa.balance);
        sa.withdrow(200);
        System.out.println("Balance after withdrawal: " + sa.balance);
        System.out.println("Interest earned: " + sa.calculateInterest());

        System.out.println("\nChecking Account:");
        System.out.println("Initial Balance: " + ca.balance);
        ca.deposit(1000);
        System.out.println("Balance after deposit: " + ca.balance);
        ca.withdrow(300);
        System.out.println("Balance after withdrawal within limit: " + ca.balance);
        ca.withdrow(700);
        System.out.println("Balance after withdrawal beyond limit: " + ca.balance);
    }

}
