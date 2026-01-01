package com.polymorphismandencapsulation.bankaccount;

class SavingsAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan request of ₹" + amount + " submitted for Savings Account");
    }

    public boolean calculateLoanEligibility() {
        return balance >= 50000;
    }
}

