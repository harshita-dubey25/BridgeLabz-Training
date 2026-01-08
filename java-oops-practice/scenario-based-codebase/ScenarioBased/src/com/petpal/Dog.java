package com.petpal;

public class Dog extends Pet{
	Dog(String name, String type, int age){
		super(name,type,age);
	}
	
	public void feed() {
		updateHunger(-25);
		updateEnergy(25);
		System.out.println(name+ " enjoyed the dog food.");
	}
	
	public void play() {
		updateHunger(15);
		updateEnergy(-10);
		System.out.println(name+ " is playing with ball.");
	}
	
	public void sleep() {
		updateEnergy(30);
		System.out.println(name+" is sleeping peacefully!!!");
	}
	
	public void makeSound() {
		System.out.println(name+" makes sound bhao bhao!!!");
	}
}
