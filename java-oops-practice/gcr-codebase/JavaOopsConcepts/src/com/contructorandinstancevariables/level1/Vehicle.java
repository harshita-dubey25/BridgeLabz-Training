package com.contructorandinstancevariables.level1;

public class Vehicle {
	      public static double registrationFees= 500;
	      String ownerName;
	      String vehicleType;
	   
	      
	      public Vehicle(String ownerName, String vehicleType) {
	    	  this.ownerName = ownerName;
	    	  this.vehicleType = vehicleType;
	      }
	      public void courseDetail() {
	    	  System.out.println("The registration fees "+registrationFees);
	    	  System.out.println("The name of owner "+this.ownerName);
	    	  System.out.println("The type of the vehicle "+this.vehicleType);
	      }
	      public static void updateInstituteName(double  price) {
	    	  double  perv = registrationFees;
	    	  registrationFees = price;
	    	  System.out.println("Fees "+perv+" change to "+registrationFees);
	      }
	      public static void main(String[] args) {
	    	  Vehicle c = new Vehicle("lucky","ct 100");
	    	  Vehicle.updateInstituteName(1000);
	    	  c.courseDetail();
	      }
	}