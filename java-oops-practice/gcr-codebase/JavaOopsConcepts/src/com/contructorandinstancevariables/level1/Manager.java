package com.contructorandinstancevariables.level1;

public class Manager extends Employee{
  
	public Manager(long e,String d, long s) {
		super(e,d,s);
	}
	public static void main(String[] args) {
	      Manager m = new Manager(12131l,"IT",10000000l);
	      
	      m.setSalary(10l);
	      
	      System.out.println(m.getSalary());
	      System.out.println(m.department);
	      System.out.println(m.employeeId);
	}

}