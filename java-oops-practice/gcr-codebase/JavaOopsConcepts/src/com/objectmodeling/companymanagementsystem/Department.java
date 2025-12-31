package com.objectmodeling.companymanagementsystem;

import java.util.ArrayList;

class Department {
    private int deptId;
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    // Composition: Department creates Employees
    public void addEmployee(int id, String name) {
        Employee emp = new Employee(id, name);
        employees.add(emp);
        System.out.println("Employee added: " + name + " to " + deptName);
    }

    public void deleteDepartment() {
        employees.clear();
        System.out.println("Department " + deptName + " deleted along with its employees.");
    }
}
