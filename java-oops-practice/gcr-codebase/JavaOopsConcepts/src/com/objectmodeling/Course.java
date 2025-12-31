package com.objectmodeling;

import java.util.ArrayList;

class Course {
    private int courseId;
    private String courseName;
    private Professor professor;     // Aggregation
    private ArrayList<Student> students;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }
}
