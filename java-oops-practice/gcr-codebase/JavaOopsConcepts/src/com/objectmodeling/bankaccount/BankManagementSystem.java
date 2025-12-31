package com.objectmodeling.bankaccount;

public class BankManagementSystem {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

        Customer c1 = new Customer(101, "Harshita");
        Customer c2 = new Customer(102, "Aman");

        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 12000); // Multiple accounts
        bank.openAccount(c2, 8000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
