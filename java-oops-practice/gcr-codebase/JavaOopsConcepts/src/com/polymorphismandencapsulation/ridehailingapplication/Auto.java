package com.polymorphismandencapsulation.ridehailingapplication;

public class Auto extends Vehicle{
	Auto(String vehicleId, String driverName, int ratePerKm){
		super(vehicleId,driverName,ratePerKm);
	}
	
	public double calculateFare(double distance) {
		return ratePerKm*distance;
	}
	
}

