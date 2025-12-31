package com.objectmodeling.bankaccount;

import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private int nextAccountNumber = 1001;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Communication: Bank opens account for customer
    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(nextAccountNumber++, initialBalance, this);
        customer.addAccount(account);
        customers.add(customer);

        System.out.println("Account opened for " + customer.getName()
                + " in " + bankName);
        return account;
    }
}
