package loanbuddy;

class HomeLoan extends LoanApplication {

    public HomeLoan(int term, double interestRate, Applicant applicant) {
        super("Home Loan", term, interestRate, applicant);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = checkEligibility(700);
        setLoanStatus(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
