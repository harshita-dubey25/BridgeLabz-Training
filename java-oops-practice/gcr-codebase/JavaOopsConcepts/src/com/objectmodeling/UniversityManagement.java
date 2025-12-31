package com.objectmodeling;

public class UniversityManagement {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Harshita");
        Student s2 = new Student(102, "Aman");

        Professor p1 = new Professor(201, "Dr. Sharma");

        Course c1 = new Course(301, "Object Oriented Programming");

        // Interactions
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        p1.assignCourse(c1);
    }
}
