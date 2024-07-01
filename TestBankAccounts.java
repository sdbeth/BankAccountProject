// TestBankAccounts.java
public class TestBankAccounts {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount("John", "Doe", 12345);
        bankAccount.deposit(500.0);
        bankAccount.withdrawal(150.0);
        bankAccount.accountSummary();
        
        System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("Jane", "Smith", 54321, 1.5);
        checkingAccount.deposit(500.0);
        checkingAccount.processWithdrawal(600.0);
        checkingAccount.displayAccount();
    }
}

