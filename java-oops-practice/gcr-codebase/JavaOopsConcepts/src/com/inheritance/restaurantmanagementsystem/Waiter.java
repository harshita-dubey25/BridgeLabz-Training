package com.inheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {

	Waiter(String name, int id){
		super(name,id);
	}
	
	public void performDuties() {
		System.out.println(name+" is serving food");
	}
}
