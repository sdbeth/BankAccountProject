// CheckingAccount.java
public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    // Process withdrawal with overdraft fee
    public void processWithdrawal(double amount) {
        if (amount > balance) {
            balance -= (amount + 30); // Overdraft fee of $30
            System.out.println("Overdraft! $30 fee has been charged.");
        } else {
            balance -= amount;
        }
    }

    // Display account information
    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
