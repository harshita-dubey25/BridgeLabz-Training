package collectionsproblems.MapInterface.InsurancePolicy;

import java.time.LocalDate;

class Policy {
    int policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(int policyNumber, String policyHolder,
           LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolder + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premium;
    }
}
