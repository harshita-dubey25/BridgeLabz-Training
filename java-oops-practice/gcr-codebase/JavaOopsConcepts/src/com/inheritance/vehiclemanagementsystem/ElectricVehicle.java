package com.inheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {
	ElectricVehicle(String model, float maxSpeed){
		super(model,maxSpeed);
	}
	void charge() {
		System.out.println(model+" Charged...");
	}
}
