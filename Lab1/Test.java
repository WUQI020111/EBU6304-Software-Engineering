package Lab1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*
         * BankAccount account1 = new BankAccount("John Smith",12345678);
         * System.out.println(account1);
         * 
         * CurrentAccount account2 = new CurrentAccount("wtx", 78945612);
         * System.out.println(account2);
         * account2.deposit(00);
         * account2.withdraw(400);
         * System.out.println(account2);
         */

        Bank bank = new Bank();
        bank.openAccount(12345678, "W", "CurrentAccount");
        bank.deposit(12345678, 300);
        bank.withdraw(12345678, 400.5);
        System.out.println(bank.checkBalance(12345678));
    }

}
