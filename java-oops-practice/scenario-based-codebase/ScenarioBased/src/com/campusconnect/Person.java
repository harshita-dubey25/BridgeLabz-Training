package com.campusconnect;

public class Person {
	String name;
	String email;
	int id;
	
	Person(String name, String email, int id){
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	void displayDetails() {
		System.out.println("Name: "+name+"\nEmail: "+email+"\nId: "+id);
	}
}
