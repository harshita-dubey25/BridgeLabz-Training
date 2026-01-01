package com.polymorphismandencapsulation.vehiclerentalsystem;

class Bike extends Vehicle {

    public Bike(String vehicleNumber, String policyNo) {
        super(vehicleNumber, "Bike", 800, policyNo);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance | Policy: " + getMaskedPolicyNumber();
    }
}
