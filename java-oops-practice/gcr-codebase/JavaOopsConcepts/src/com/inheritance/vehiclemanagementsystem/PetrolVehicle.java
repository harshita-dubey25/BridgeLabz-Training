package com.inheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
	PetrolVehicle(String model, float maxSpeed){
		super(model,maxSpeed);
	}
	
	public void refuel() {
		System.out.println("Refueling done in "+model);
	}
}
