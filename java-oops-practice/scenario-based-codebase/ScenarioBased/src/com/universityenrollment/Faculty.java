package com.universityenrollment;

public class Faculty {
	private String name;

    public Faculty(String name) { this.name = name; }

    public void gradeStudent(Graded enrollment, double score) {
        
        enrollment.assignGrade(score);
    }
}