package com.classandobject.level2;

public class StudentsGradesMain {

	public static void main(String[] args) {
		double[] mark1 = {80,70,75};
		double[] mark2 = {60,65,50};
		
		StudentsGrades student1 = new StudentsGrades("Thamarai", "ECE001", mark1);
		StudentsGrades student2 = new StudentsGrades("Kannan","CSC002",mark2);
		
		student1.displayStudent();
		student2.displayStudent();
	}
}
