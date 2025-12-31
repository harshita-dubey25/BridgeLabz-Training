package com.inheritance.bankaccount;

public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 20000);
        FixedDepositAccount fda = new FixedDepositAccount(103, 100000, 5);

        sa.displayAccountType();
        sa.showBalance();
        System.out.println();

        ca.displayAccountType();
        ca.showBalance();
        System.out.println();

        fda.displayAccountType();
        fda.showBalance();
    }
}
