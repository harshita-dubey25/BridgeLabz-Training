package com.petpal;
import java.util.*;

abstract public class Pet implements IInteractable {
	String name;
	String type;
	int age;
	
	private int hunger;
	private int energy;
	private String mood;
	
	Pet(String name, String type, int age){
		this.name = name;
		this.type = type;
		this.age = age;
		
		Random r =new Random();
		
		this.hunger = r.nextInt(40)+10;
		this.energy = r.nextInt(40)+40;
		updateMood();
	}
	
	public void updateHunger(int value) {
		hunger = Math.max(0,Math.min(100,hunger+value));
		updateMood();
	}
	public void updateEnergy(int value) {
		energy = Math.max(0,Math.min(100,energy+value));
		updateMood();
	}
	
	public void updateMood() {
		if(hunger < 30 && energy >60)
			mood = "Happy😊";
		else if(hunger>70)
			mood = "Hungry😟";
		else if(energy<30)
			mood = "Tired🥱";
		else
			mood = "Normal";
	}
	
	public void displayStatus() {
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Age: "+age);
		System.out.println("Mood: "+mood);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}
	abstract void makeSound();
}
