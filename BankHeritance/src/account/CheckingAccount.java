package account;

public class CheckingAccount extends BankAccount {

    private double withdrawLimit;
    private double fee;

    public CheckingAccount(double balance, double withdrawLimit, double fee) {
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
        this.fee = fee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;    
    }

    @Override
    public void withdrow(double amount) {
if (amount <= withdrawLimit) {
            balance -= amount;
        } else {
            balance -= amount + fee;
        }    
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

}