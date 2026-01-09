package loanbuddy;

abstract class LoanApplication implements IApprovable {

    protected String loanType;
    protected int term; 
    protected double interestRate;

    protected Applicant applicant;

    private boolean loanApproved; 

    public LoanApplication(String loanType, int term, double interestRate, Applicant applicant) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
        this.applicant = applicant;
    }

    protected void setLoanStatus(boolean status) {
        this.loanApproved = status;
    }

    public boolean getLoanStatus() {
        return loanApproved;
    }

    protected boolean checkEligibility(int minCreditScore) {
        return applicant.getCreditScore() >= minCreditScore &&
               applicant.getIncome() >= applicant.getLoanAmount() * 0.3;
    }
}
