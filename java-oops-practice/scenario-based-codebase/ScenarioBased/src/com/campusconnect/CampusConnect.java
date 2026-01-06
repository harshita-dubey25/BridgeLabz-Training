package com.campusconnect;

import java.util.*;

public class CampusConnect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Student> students = new HashMap<>();
        Map<Integer, Faculty> faculties = new HashMap<>();
        Map<String, Course> courses = new HashMap<>();

        int choice;

        do {
            System.out.println("\n===== CampusConnect Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Create Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Add Grade to Student");
            System.out.println("6. View Course Details");
            System.out.println("7. View Student Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();

                    System.out.print("Enter Student Email: ");
                    String semail = sc.nextLine();

                    students.put(sid, new Student(sname,semail,sid));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Faculty ID: ");
                    int fid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Faculty Name: ");
                    String fname = sc.nextLine();

                    System.out.print("Enter Faculty Email: ");
                    String femail = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    faculties.put(fid, new Faculty(fname,femail,fid, dept));
                    System.out.println("Faculty added successfully.");
                    break;

                case 3:
                    System.out.print("Enter Course Name: ");
                    sc.nextLine();
                    String cname = sc.nextLine();

                    System.out.print("Enter Faculty ID for this course: ");
                    int fcid = sc.nextInt();

                    if (!faculties.containsKey(fcid)) {
                        System.out.println("Faculty not found!");
                        break;
                    }

                    courses.put(cname, new Course(cname, faculties.get(fcid)));
                    System.out.println("Course created successfully.");
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int esid = sc.nextInt();

                    System.out.print("Enter Course Name: ");
                    sc.nextLine();
                    String ecourse = sc.nextLine();

                    if (!students.containsKey(esid) || !courses.containsKey(ecourse)) {
                        System.out.println("Student or Course not found!");
                        break;
                    }

                    students.get(esid).enrollCourse(courses.get(ecourse));
                    System.out.println("Student enrolled successfully.");
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int gid = sc.nextInt();

                    if (!students.containsKey(gid)) {
                        System.out.println("Student not found!");
                        break;
                    }

                    System.out.print("Enter Grade: ");
                    int grade = sc.nextInt();

                    students.get(gid).addGrade(grade);
                    System.out.println("Grade added successfully.");
                    break;

                case 6:
                    System.out.print("Enter Course Name: ");
                    sc.nextLine();
                    String viewCourse = sc.nextLine();

                    if (!courses.containsKey(viewCourse)) {
                        System.out.println("Course not found!");
                        break;
                    }

                    courses.get(viewCourse).displayDetails();
                    break;

                case 7:
                    System.out.print("Enter Student ID: ");
                    int vsid = sc.nextInt();

                    if (!students.containsKey(vsid)) {
                        System.out.println("Student not found!");
                        break;
                    }

                    students.get(vsid).displayDetails();
                    break;

                case 0:
                    System.out.println("Exiting CampusConnect... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}

