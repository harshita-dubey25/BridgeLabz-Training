package com.inheritance.restaurantmanagementsystem;

public class Person {
	String name;
	int id;
	
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	void showFDetails() {
		System.out.println("Id : "+id+"\nName :"+name);
	}
}
