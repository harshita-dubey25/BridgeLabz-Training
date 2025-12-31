package com.inheritance.bankaccount;

class FixedDepositAccount extends BankAccount {
    private int lockInPeriod; // in years

    public FixedDepositAccount(int accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Lock-in Period: " + lockInPeriod + " years");
    }
}
