package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.IValuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam","123", 12500);
        IValuable account2 = new BankAccount("Gary, "456", 1500);

        account1.deposit(100);

    }
}
