package com.objectmodeling.bankaccount;

import java.util.ArrayList;

class Customer {
    private int customerId;
    private String name;
    private ArrayList<Account> accounts;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Association: Customer has multiple accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Communication method
    public void viewBalance() {
        System.out.println("Account balances of " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber()
                    + " | Balance: ₹" + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}
