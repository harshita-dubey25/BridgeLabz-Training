package com.contructorandinstancevariables.level1;

public class SubClass extends Student{

	public static void main(String[] args) {
		Student u = new Student(101,"Lucky Pal",7.48);
		u.updateCGPA(7.5);
		System.out.println(u.name);
		System.out.println(u.rollNumber);
		System.out.println();
	}

}