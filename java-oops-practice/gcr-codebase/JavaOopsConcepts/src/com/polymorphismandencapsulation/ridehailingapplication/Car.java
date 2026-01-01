package com.polymorphismandencapsulation.ridehailingapplication;

public class Car extends Vehicle {
	Car(String vehicleId, String driverName, int ratePerKm){
		super(vehicleId,driverName,ratePerKm);
	}
	
	public double calculateFare(double distance) {
		return ratePerKm*distance;
	}
	
}

