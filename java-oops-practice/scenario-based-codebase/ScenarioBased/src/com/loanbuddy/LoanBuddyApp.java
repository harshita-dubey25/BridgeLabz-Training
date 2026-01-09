package loanbuddy;

public class LoanBuddyApp {
    public static void main(String[] args) {

        Applicant applicant1 = new Applicant(
                "Harshita", 720, 80000, 1500000);

        LoanApplication homeLoan =
                new HomeLoan(240, 8.5, applicant1);

        if (homeLoan.approveLoan()) {
            System.out.println("✅ Loan Approved");
            System.out.println("EMI: ₹" + homeLoan.calculateEMI());
        } else {
            System.out.println("❌ Loan Rejected");
        }

        System.out.println();

        LoanApplication autoLoan =
                new AutoLoan(60, 9.2, applicant1);

        if (autoLoan.approveLoan()) {
            System.out.println("✅ Auto Loan Approved");
            System.out.println("EMI: ₹" + autoLoan.calculateEMI());
        } else {
            System.out.println("❌ Auto Loan Rejected");
        }
    }
}
