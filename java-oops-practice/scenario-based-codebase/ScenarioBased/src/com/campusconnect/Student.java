package com.campusconnect;
import java.util.*;

public class Student extends Person implements ICourseActions{
	private List<Integer> grades;   
    private List<Course> courses;
    
	Student(String name, String email, int id){
		super(name,email,id);
		grades = new ArrayList<>();
		courses = new ArrayList<>();
	}
	
	public void addGrade(int grade) {
		grades.add(grade);
	}
	
	double calculateGPA() {
		int sum = 0;
		for(int g: grades) {
			sum+=g;
		}
		if(grades.size()==0)
			return 0;
		return (double)sum / grades.size();		
	}
	public void enrollCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	public void dropCourse(Course course) {
		courses.remove(course);
		course.removeStudent(this);
	}
	
	void displayDetails() {
		System.out.println("Name: "+name+"\nId: "+id+"\nGPA: "+calculateGPA());
	}
	
}
