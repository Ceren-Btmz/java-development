package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.IValuable;
import com.pluralsight.finance.Portfolio;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam","123", 12500);
        IValuable account2 = new BankAccount("Gary, "456", 1500);

        account1.deposit(100);

        Portfolio port = new Portfolio("yearup", "Ceren");

        port.add(account1);
        port.add(account2);

        System.out.println(port.getMostValuable());
        System.out.println(port.getLeastValuable());
        System.out.println(port.getValue());
    }

    public void displayMenu() {
}
