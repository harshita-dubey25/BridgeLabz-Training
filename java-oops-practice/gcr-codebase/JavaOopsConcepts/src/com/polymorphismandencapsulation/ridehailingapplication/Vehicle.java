package com.polymorphismandencapsulation.ridehailingapplication;

public abstract class Vehicle implements GPS {
	private String vehicleId;
	private String driverName;
	protected int ratePerKm;
	private String currentLocation;
	
	Vehicle(String vehicleId, String driverName, int ratePerKm){
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
		this.currentLocation = "unknown";
	}
	
	abstract double calculateFare(double distance);
	
	public void getVehicleDetails() {
		System.out.println("Vehicle Id: "+vehicleId);
		System.out.println("Driver:"+driverName);
		System.out.println("Rate per Km: "+ratePerKm);
		System.out.println("Current Location: "+currentLocation);
	}
	
	public String getCurrentLocation() {
		return currentLocation;
	}

	public void updateLocation(String location) {
		currentLocation = location;
	}
}
