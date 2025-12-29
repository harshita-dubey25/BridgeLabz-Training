package com.contructorandinstancevariables.level1;

public class Employee {
	public long employeeId;
	protected String department;
	private long salary;
	
	public Employee(long employeeId, String department, long salary) {
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getSalary() {
		return this.salary;
	}
}