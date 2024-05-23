
package account;

public class CurrentAccount extends Account{
    private static final double MaintenanceFee = 50.0;

    public CurrentAccount() {
    }

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
         setBalance(getBalance() - MaintenanceFee);
        System.out.println("Current Account " + getAccountNumber() + " new balance after maintenance fee: " + getBalance());
    }
    
    
}
