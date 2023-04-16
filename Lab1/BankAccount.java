package Lab1;

public class BankAccount {
    // instance variables
    private final int accountNumber;
    private String accountName;
    private double balance;

    // constructors
    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    public BankAccount(String accountName, int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
    }

    // accessors
    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // mutators
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    // deposit method
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // withdraw method
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public String toString() {
        return "Account type" + getClass() + "\n"
                + "Account number: " + accountNumber + "\n"
                + "Account name: " + accountName + "\n"
                + "Balance: " + balance;
    }

}
