package com.polymorphismandencapsulation.ridehailingapplication;

public class Bike extends Vehicle {
	Bike(String vehicleId, String driverName, int ratePerKm){
		super(vehicleId,driverName,ratePerKm);
	}
	
	public double calculateFare(double distance) {
		return ratePerKm*distance;
	}
	
}

