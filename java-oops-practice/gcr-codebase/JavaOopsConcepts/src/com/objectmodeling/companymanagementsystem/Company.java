package com.objectmodeling.companymanagementsystem;

import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Composition: Company creates Departments
    public void addDepartment(int id, String name) {
        Department dept = new Department(id, name);
        departments.add(dept);
        System.out.println("Department added: " + name);
    }

    // Delete company → delete all departments & employees
    public void deleteCompany() {
        for (Department d : departments) {
            d.deleteDepartment();
        }
        departments.clear();
        System.out.println("Company deleted. All departments and employees removed.");
    }
}
