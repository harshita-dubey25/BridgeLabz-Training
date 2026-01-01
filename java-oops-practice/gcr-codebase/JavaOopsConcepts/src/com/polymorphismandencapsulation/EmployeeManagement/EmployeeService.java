package com.polymorphismandencapsulation.EmployeeManagement;

class EmployeeService {

    public static void processEmployees(Employee[] employees) {

        for (Employee emp : employees) {
            emp.displayDetails();

            if (emp instanceof Department) {
                Department d = (Department) emp;
                System.out.println(d.getDepartmentDetails());
            }

            System.out.println("Calculated Salary: ₹" + emp.calculateSalary());
            System.out.println("--------------------------------");
        }
    }
}
