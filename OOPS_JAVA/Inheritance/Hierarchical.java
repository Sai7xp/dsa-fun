package Inheritance;

// Parent Class
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method for all accounts
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Common method for all accounts
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display account details
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Child Class 1: Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call parent class constructor
        this.interestRate = interestRate;
    }

    // Unique method for savings account
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

// Child Class 2: Current Account
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); // Call parent class constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to include overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000, 5);
        savingsAccount.deposit(500);
        savingsAccount.addInterest();
        savingsAccount.displayBalance();

        // Create a CurrentAccount object
        CurrentAccount currentAccount = new CurrentAccount("CA456", 2000, 1000);
        currentAccount.withdraw(2500); // Within overdraft limit
        currentAccount.displayBalance();
    }
}
