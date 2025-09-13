import java.util.Scanner;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        // Accessing public member accountNumber
        System.out.println("Account Number: " + accountNumber);
        // Accessing protected member accountHolder
        System.out.println("Account Holder: " + accountHolder);
        // Accessing private member balance via public getter
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();

        System.out.print("Enter account number: ");
        savingsAccount.accountNumber = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        savingsAccount.accountHolder = scanner.nextLine();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        savingsAccount.setBalance(balance);

        System.out.println("\nSavings Account Details:");
        savingsAccount.displayDetails();

        scanner.close();
    }
}
