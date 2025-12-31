package com.inheritance.vehiclemanagementsystem;

public class Vehicle {
	float maxSpeed;
	String model;
	
	Vehicle(String model, float maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	void displayDetails() {
		System.out.println("Model: "+model);
		System.out.println("Maximum Speed: "+maxSpeed);
	}
}
