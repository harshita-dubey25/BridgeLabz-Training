package com.contructorandinstancevariables.level1;

public class Course {
	String courseName;
	int duration;
	int fee;
	static String instituteName = "Technocrats";
	
	Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	void displayCourseDetails() {
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration);
		System.out.println("Fee: "+fee);
		System.out.println("Intitute: "+instituteName);
		System.out.println("_ _ _ _ _ _ _ _ _ _");
	}
	static void updateInstituteName() {
		instituteName = "Bansal";
	}
}
