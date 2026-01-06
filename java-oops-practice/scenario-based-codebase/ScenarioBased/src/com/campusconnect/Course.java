package com.campusconnect;
import java.util.*;

public class Course {
	String courseName;
	private List<Student> students;
	private Faculty faculty;
	
	Course(String courseName, Faculty faculty){
		this.courseName = courseName;
		this.faculty = faculty;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
    
    void displayDetails() {
		System.out.println("Course Name: "+courseName);
		faculty.displayDetails();
		System.out.println("Enrolled Students:");
		for(Student s: students) {
			s.displayDetails();
		}
	}
}
