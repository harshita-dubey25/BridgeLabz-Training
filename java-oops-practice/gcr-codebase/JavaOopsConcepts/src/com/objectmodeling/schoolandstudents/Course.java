package com.objectmodeling.schoolandstudents;

import java.util.ArrayList;

class Course {
    private int courseId;
    private String courseName;
    private ArrayList<Student> students;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // View enrolled students
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

