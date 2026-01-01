package com.polymorphismandencapsulation.vehiclerentalsystem;

class Car extends Vehicle {

    public Car(String vehicleNumber, String policyNo) {
        super(vehicleNumber, "Car", 2000, policyNo);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance | Policy: " + getMaskedPolicyNumber();
    }
}

