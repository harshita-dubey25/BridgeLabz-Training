package com.contructorandinstancevariables.level1;

public class Product {

	String productName;
	float price;
	static int totalProduct = 0;
	
	Product(String productName, float price){
		this.productName = productName;
		this.price = price;
		totalProduct++;
	}
	void diaplayProductDetails() {
		System.out.println("Product Name: "+productName);
		System.out.println("Price"+price);
	}
	public static void displayTotalProducts() {
		System.out.println("Total Products: "+totalProduct);
	}
	

}
