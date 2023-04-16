package Lab1;

public class CurrentAccount extends BankAccount {
    public static final double LIMIT = -500;

    public CurrentAccount(String accountName, int accountNumber) {
        super(accountNumber, accountName);
    }

    public CurrentAccount(int accountNumber, String accountName) {
        super(accountNumber, accountName);
    }

    public void deposit(double amount) {
        super.deposit(amount);
        checkOverDraft();
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < LIMIT) {
            System.out.println("Withdraw denied. You can only withdraw 500");
        } else {
            super.withdraw(amount);
            checkOverDraft();
        }
    }

    public void checkOverDraft() {
        if (getBalance() < 0) {
            System.out.println("Waring: Your account is in overdraft state");
        }
    }

}
