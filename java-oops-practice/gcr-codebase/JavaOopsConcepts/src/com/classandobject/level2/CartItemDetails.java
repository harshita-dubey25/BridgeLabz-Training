package com.classandobject.level2;

public class CartItemDetails {

	public static void main(String[] args) {
		CartItem item1 = new CartItem("Laptop", 999.99, 1);
	       item1.displayItem();  // Display the initial item details
	       // Adding and removing items
	       item1.addItem(2);      // Adding 2 more laptops
	       item1.removeItem(1);   // Removing 1 laptop
	       // Display total cost
	       System.out.println("Total cost: $" + item1.totalCost());
	}
}
