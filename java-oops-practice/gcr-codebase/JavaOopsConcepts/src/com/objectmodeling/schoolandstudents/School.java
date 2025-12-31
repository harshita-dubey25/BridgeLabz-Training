package com.objectmodeling.schoolandstudents;

import java.util.ArrayList;

class School {
    private String schoolName;
    private ArrayList<Student> students; // Aggregation

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to " + schoolName);
    }
}
