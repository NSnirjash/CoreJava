
package account;

public class SavingAccount extends BankAccount{
    public double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrow(double amount) {
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
    
}
