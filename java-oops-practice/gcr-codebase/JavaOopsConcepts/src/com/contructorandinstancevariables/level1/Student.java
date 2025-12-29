package com.contructorandinstancevariables.level1;

public class Student {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public Student() {
	}
	public Student(int rollNumber,String name, double cgpa) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	public void updateCGPA(double cgpa) {
		this.cgpa = cgpa;
		System.out.println(this.cgpa);
	}
	public double getCGPA() {
		return this.cgpa;
	}
}