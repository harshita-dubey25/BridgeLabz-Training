package com.objectmodeling.companymanagementsystem;

public class CompanyManagementSystem {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions Pvt Ltd");

        company.addDepartment(1, "IT");
        company.addDepartment(2, "HR");

        // Access departments indirectly is avoided in pure composition,
        // but shown here for demo clarity
        Department itDept = new Department(1, "IT");
        itDept.addEmployee(101, "Harshita");
        itDept.addEmployee(102, "Aman");

        // Delete company
        company.deleteCompany();
    }
}
