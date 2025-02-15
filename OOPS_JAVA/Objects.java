import java.util.*;

class BankAccount {
    String name;
    double balance;
    int accNo;
    List<Integer> phoneNumbers;

    // default constructor
    public BankAccount() {
    }

    public BankAccount(int temp) {
    }

    // parameterized constructor
    public BankAccount(String name, double bal, int accNo) {
        this(6);
        this.name = name;
        balance = bal; // we don't have to use the this here since the bal parameter name is different
        this.accNo = accNo;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount : name=" + name + ", balance=" + balance + ", accNo=" + accNo;
    }

}

public class Objects {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println(b);

        BankAccount bobAccount = new BankAccount("Bob", 200, 1230);
        System.out.println("Account Data: " + bobAccount);
        bobAccount.deposit(100);
        System.out.println("Account Balance after deposit: " + bobAccount.balance);

        modifyAccount(bobAccount);
        System.out.println("Account after trying to modifyAccount(): " + bobAccount);

        stealBalance(bobAccount);
        System.out.println("Account Balance after stealBalance(): " + bobAccount.balance);

    }

    static void modifyAccount(BankAccount a) {
        a = new BankAccount("Alice", 999, 9876);
    }

    static void stealBalance(BankAccount a) {
        a.balance = 0;
    }

}
