package com.bank;

public class CurrentAccount extends Account{
	public CurrentAccount(String accNum, double initial) {
        super(accNum, initial);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit reached!");
        }
    }

    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }
}