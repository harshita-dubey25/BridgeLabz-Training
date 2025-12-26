package com.classandobject.level1;

public class Employee {
		String name;
		int id;
		double salary;
		
		Employee(String name, int id,double salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		public  void displayEmployee() {
			System.out.println("Employee Name: "+name);
			System.out.println("Employee id: "+id);
			System.out.println("Employee Salary: "+salary);
		}
		
		public static void main(String[] args) {
		Employee emp=new Employee("Rohan",1,500000);
		Employee emp2=new Employee("Harshita",2,1000000);
		emp.displayEmployee();
		emp2.displayEmployee();
		}
}