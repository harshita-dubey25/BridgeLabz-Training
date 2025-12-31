package com.objectmodeling;

import java.util.ArrayList;

class Student {
    private int studentId;
    private String name;
    private ArrayList<Course> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Association: Student enrolls in Course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
