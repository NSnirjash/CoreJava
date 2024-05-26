
package account;

public class SavingsAccount extends Account{
    public static final double interestRate = 0.05;

    public SavingsAccount() {
    }

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Savings Account " + getAccountNumber() + " new balance after interest: " + getBalance());
    }

}
