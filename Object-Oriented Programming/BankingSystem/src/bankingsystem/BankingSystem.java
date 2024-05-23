/*
 * Question:
 * 1. Create an abstract class Account with properties accountNumber and balance. 
 * Include an abstract method calculateInterest().
 * 2. Create two subclasses SavingsAccount and CurrentAccount that extend Account.
 * -> In SavingsAccount, implement calculateInterest() to add a specific interest rate to the balance.
 * -> In CurrentAccount, implement calculateInterest() to deduct a maintenance fee from the balance.
 3. Demonstrate polymorphism by creating an array of Account objects and calling 
 * calculateInterest() on each one.
 * 
 */
package bankingsystem;

import account.CurrentAccount;
import account.SavingsAccount;

public class BankingSystem {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA12345", 1000.0);
        sa.calculateInterest();
        CurrentAccount ca = new CurrentAccount("CA12345", 2000.0);
        ca.calculateInterest();
        
    }
    
}
