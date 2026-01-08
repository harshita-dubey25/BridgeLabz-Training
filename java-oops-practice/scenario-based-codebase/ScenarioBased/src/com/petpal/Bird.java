package com.petpal;

public class Bird extends Pet{
	Bird(String name, String type, int age){
		super(name,type,age);
	}
	
	public void feed() {
		updateHunger(-10);
		updateEnergy(15);
		System.out.println(name+ " ate some seeds.");
	}
	
	public void play() {
		updateHunger(15);
		updateEnergy(-10);
		System.out.println(name+ " is flying around.");
	}
	
	public void sleep() {
		updateEnergy(30);
		System.out.println(name+" is taking rest!!!");
	}
	
	public void makeSound() {
		System.out.println(name+" makes sound chirp chirp!!!");
	}
}

