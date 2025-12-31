package com.objectmodeling;

public class UniversitySystem {
    public static void main(String[] args) {

        // Faculty exists independently
        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");

        // University creation
        University uni = new University("ABC University");

        uni.addDepartment(1, "Computer Science");
        uni.addDepartment(2, "Mechanical Engineering");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("Faculty still exists: " + f1.getName());
    }
}
