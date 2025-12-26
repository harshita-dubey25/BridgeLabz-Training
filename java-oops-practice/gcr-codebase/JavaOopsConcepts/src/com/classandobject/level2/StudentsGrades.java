package com.classandobject.level2;

public class StudentsGrades {
	String name;
	String rollNumber;
	double[] marks;
	
	StudentsGrades(String name,String rollNumber,double[] marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	public String calculateGrade(double[] marks ) {
		
		double totalMarks = calculateTotalMarks(marks);
		
		if(totalMarks >= 80 && totalMarks<=100) {
			return "Grade A";
		}
		else if((totalMarks >=60)&&(totalMarks <80)){
			return "Grade B";
		}
		else if((totalMarks >=50)&&(totalMarks <60)) {
			return "Grade C";
		}
		else if((totalMarks >=40)&&(totalMarks <50)) {
			return "Grade D";
		}
		else {
			return "Grade F";
		}
	}
	
	public void displayStudent() {
		System.out.println("Student Name: "+name);
		
		System.out.println("Student RollNumber: "+rollNumber);
		
		System.out.println("Student Marks:");
		
		for(int i=0;i < marks.length ; i++ ) {
			System.out.println("Mark"+(i+1)+": "+marks[i]);
		}
		
		System.out.println(calculateGrade(marks));
	}
	
	public double calculateTotalMarks(double[] marks)
	{
		double sum = 0;
		for(int i=0;i < marks.length ; i++ ) {
			sum+=marks[i];
		}
		return sum/3;
	}
	

}
