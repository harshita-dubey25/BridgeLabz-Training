package com.polymorphismandencapsulation.bankaccount;

class CurrentAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan request of ₹" + amount + " submitted for Current Account");
    }

    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}
