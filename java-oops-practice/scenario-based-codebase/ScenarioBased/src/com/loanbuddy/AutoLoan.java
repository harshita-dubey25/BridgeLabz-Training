package loanbuddy;

class AutoLoan extends LoanApplication {

    public AutoLoan(int term, double interestRate, Applicant applicant) {
        super("Auto Loan", term, interestRate, applicant);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = checkEligibility(650);
        setLoanStatus(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = (interestRate + 1) / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
