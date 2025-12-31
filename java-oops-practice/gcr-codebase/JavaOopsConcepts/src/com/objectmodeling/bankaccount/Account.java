package com.objectmodeling.bankaccount;

class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;   // Association

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
