package com.campusconnect;

public class Faculty extends Person{
	private String department;
	Faculty(String name, String email, int id,String department){
		super(name,email,id);
		this.department = department;
	}
	
	void displayDetails(){
		System.out.println("Faculty Name: "+name+"\nId: "+id+"\nDepartment: "+department);
	}
}
