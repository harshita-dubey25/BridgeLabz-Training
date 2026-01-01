package com.polymorphismandencapsulation.vehiclerentalsystem;

abstract class Vehicle implements Insurable {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate,
                   String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public void getVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: ₹" + rentalRate);
    }

    protected String getMaskedPolicyNumber() {
        return "XXXX-" + insurancePolicyNumber.substring(
                insurancePolicyNumber.length() - 4);
    }
}
