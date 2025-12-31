package com.objectmodeling;

import java.util.ArrayList;

class University {
    private String universityName;
    private ArrayList<Department> departments; // Composition
    private ArrayList<Faculty> facultyMembers; // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Composition: University creates Departments
    public void addDepartment(int id, String name) {
        Department dept = new Department(id, name);
        departments.add(dept);
        System.out.println("Department added: " + name);
    }

    // Aggregation: Faculty exists independently
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        System.out.println("Faculty added: " + faculty.getName());
    }

    // Demonstrating deletion of University → Departments destroyed
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted. All departments removed.");
    }
}
