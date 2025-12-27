package com.contructorandinstancevariables.level1;

public class Person {
	
	String name;
	String gender;
	int age;
	
	Person(){
		name = "Harshita";
		gender = "Female";
		age = 22;
	}
	
	Person(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	Person(Person p){
		this.name = p.name;
		this.gender = p.gender;
		this.age = p.age;
	}
	
	void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("_ _ _ _ _ _ _ _ _ _ ");
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Ansh","Male",21);
        Person p3 = new Person(p2);
        
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
	}

}
