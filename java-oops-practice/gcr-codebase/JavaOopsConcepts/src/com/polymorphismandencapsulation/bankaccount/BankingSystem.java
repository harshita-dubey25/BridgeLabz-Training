package com.polymorphismandencapsulation.bankaccount;

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", "Riya", 60000);
        BankAccount acc2 = new CurrentAccount("CA202", "Amit", 120000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.getAccountDetails();
            System.out.println("Interest: ₹" + acc.calculateInterest());

            acc.applyForLoan(50000);
            System.out.println("Loan Eligible: " + acc.calculateLoanEligibility());
            System.out.println();
        }
    }
}
