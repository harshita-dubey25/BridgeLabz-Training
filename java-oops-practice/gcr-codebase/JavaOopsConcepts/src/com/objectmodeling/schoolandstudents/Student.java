package com.objectmodeling.schoolandstudents;

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

    // View enrolled courses
    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
