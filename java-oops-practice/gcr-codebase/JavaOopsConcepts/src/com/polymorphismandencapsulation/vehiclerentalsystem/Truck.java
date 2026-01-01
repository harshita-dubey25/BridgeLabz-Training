package com.polymorphismandencapsulation.vehiclerentalsystem;

class Truck extends Vehicle {

    public Truck(String vehicleNumber, String policyNo) {
        super(vehicleNumber, "Truck", 3500, policyNo);
    }

    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; 
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: " + getMaskedPolicyNumber();
    }
}
