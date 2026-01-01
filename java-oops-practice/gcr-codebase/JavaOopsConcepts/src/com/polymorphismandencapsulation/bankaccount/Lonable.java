package com.polymorphismandencapsulation.bankaccount;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
