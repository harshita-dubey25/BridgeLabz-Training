package com.petpal;

public class Cat extends Pet{
	Cat(String name, String type, int age){
		super(name,type,age);
	}
	
	public void feed() {
		updateHunger(-20);
		updateEnergy(25);
		System.out.println(name+ " enjoyed the fish.");
	}
	
	public void play() {
		updateHunger(20);
		updateEnergy(-15);
		System.out.println(name+ " is playing with wool.");
	}
	
	public void sleep() {
		updateEnergy(30);
		System.out.println(name+" is taking nap!!!");
	}
	
	public void makeSound() {
		System.out.println(name+" makes sound meow meow!!!");
	}
}
