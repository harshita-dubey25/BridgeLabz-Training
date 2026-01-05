package com.rentalapplication;

public class Car extends Vehicle implements Rental{
	public Car(String plateNumber) {
        super(plateNumber, 50.0); 
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 10.0;
        return (baseRate * days) + surcharge; 
    }

    @Override
    public String getVehicleType() { return "Car"; }
}