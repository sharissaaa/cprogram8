import java.util.Scanner;

public class Account {
    private String accountHolderName;
    private int accountNumber;
    private String address;
    private String accountType;
    private double balance;

    // First constructor with three parameters
    public Account(String accountHolderName, int accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    // Second constructor with five parameters
    public Account(String accountHolderName, int accountNumber, String address, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for account 1
        System.out.println("Enter account holder name, account number, and initial amount for account 1:");
        String name1 = scanner.nextLine();
        int number1 = scanner.nextInt();
        double initialAmount1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // Creating account 1 object
        Account account1 = new Account(name1, number1, initialAmount1);

        // Getting user input for account 2
        System.out.println("Enter account holder name, account number, address, account type, and balance for account 2:");
        String name2 = scanner.nextLine();
        int number2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String address2 = scanner.nextLine();
        String type2 = scanner.nextLine();
        double balance2 = scanner.nextDouble();

        // Creating account 2 object
        Account account2 = new Account(name2, number2, address2, type2, balance2);

        // Performing operations on accounts
        account1.deposit(500.0);
        account2.withdraw(300.0);

        // Displaying the current balances of accounts
        System.out.println("Account 1 balance: $" + account1.getBalance());
        System.out.println("Account 2 balance: $" + account2.getBalance());

        scanner.close();
    }
}
