package com.rentalhailing;

public class Vehicle {
	private String vehicleNumber;
	private int capacity;
	private String type;
	private double baseFare;
	private double ratePerKm;
	
	public Vehicle(String vehicleNumber, int capacity, String type, double baseFare, double ratePerKm) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.baseFare = baseFare;
		this.ratePerKm = ratePerKm;
	}
	
	public double getBaseFare() { 
		return baseFare; 
	}
    public double getRatePerKm() { 
    	return ratePerKm;
    }
    public String getType() { 
    	return type; 
    }
    public String getVehicleNumber() { 
    	return vehicleNumber; 
    }
}