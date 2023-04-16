package Lab1;

import java.util.*;

public class Bank {
    public ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    // open account
    public void openAccount(int accountNumber, String accountName, String accountType) {
        if (accountType.equals("BankAccount")) {
            BankAccount account = new BankAccount(accountName, accountNumber);
            accounts.add(account);
            // System.out.println(account);
        }

        if (accountType.equals("CurrentAccount")) {
            BankAccount account = new CurrentAccount(accountName, accountNumber);
            accounts.add(account);
            System.out.println(account);
        }
    }

    // close account
    public void closeAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                break;
            }
        }
    }

    // deposit method
    public void deposit(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                break;
            }
        }
    }

    // withdraw method
    public void withdraw(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                break;
            }
        }
    }

    public double checkBalance(int accountNumber) {
        double temp = 0;
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                temp = account.getBalance();
                break;
            }
        }
        return temp;
    }

    public String toString(int accountNumber) {
        BankAccount temp = new BankAccount(accountNumber, null);
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                temp = account;
                break;
            }
        }
        return temp.toString();
    }
}
