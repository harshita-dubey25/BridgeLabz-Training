package com.contructorandinstancevariables.level1;
import java.util.*;

public class Circle {
	
	float radius;
	
	Circle(){
		this(5);
	}
	
	Circle(float radius){
		this.radius = radius;
	}
    
	private double area() {
		double a = 3.14*radius*radius;
		return a;
	}
	private void displayDetails() {
		System.out.println("Radius: "+radius);
		System.out.println("Area: "+area());
	}
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(10);
		
		c1.displayDetails();
		c2.displayDetails();
	}

}
