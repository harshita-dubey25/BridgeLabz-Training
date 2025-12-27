package com.contructorandinstancevariables.level1;

public class CarRental {
	
	String customerName;
	String carModel;
	int rentalDays;
	float price;
	
	CarRental(String customerName,String carModel,int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	float totalCost(String carModel) {
		
		float price = switch(carModel.toLowerCase()) {
			case "audi" -> 100;
			case "fortuner" -> 250;
			case "mercedes" -> 300;
			case "bogati" -> 500;
			default -> 50;		
		};
		return price*rentalDays;
	}
	
	void diaplayDetails() {
		System.out.println("Book: " + customerName);
        System.out.println("Author: " + carModel);
        System.out.println("Price: " + rentalDays);
        System.out.println("Total Cost: "+totalCost(carModel));
        System.out.println("_ _ _ _ _ _ _ _ _");
	}
	public static void main(String[] args) {
		
		CarRental c1 = new CarRental("Ansh","Bogati",13);
		CarRental c2 = new CarRental("Harshita","Fortuner",25);
		CarRental c3 = new CarRental("Aditi","Audi",1);
		
		c1.diaplayDetails();
		c2.diaplayDetails();
		c3.diaplayDetails();
	}
}
