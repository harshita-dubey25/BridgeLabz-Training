package com.objectmodeling.schoolandstudents;

public class SchoolManagement {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student(101, "Harshita");
        Student s2 = new Student(102, "Aman");

        Course c1 = new Course(1, "Mathematics");
        Course c2 = new Course(2, "Computer Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        s1.showCourses();
        c2.showStudents();
    }
}
