package com.contructorandinstancevariables.level1;

public class ProductMain {

        public static void main(String[] args) {
		
		Product p1 = new Product("Laptop",50000);
		p1.diaplayProductDetails();
		p1.displayTotalProducts();
		
		Product p2 = new Product("Head Phone",20000);
		p2.diaplayProductDetails();
		p2.displayTotalProducts();
		
		Product p3 = new Product("Desktop",60000);	
		p3.diaplayProductDetails();
		p3.displayTotalProducts();
		
	}

}
