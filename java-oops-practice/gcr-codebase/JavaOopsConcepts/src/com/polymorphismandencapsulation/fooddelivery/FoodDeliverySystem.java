package com.polymorphismandencapsulation.fooddelivery;

public class FoodDeliverySystem {

    public static void processOrder(FoodItem item) {

        item.getItemDetails();
        double total = item.calculateTotalPrice();
        double discount = item.applyDiscount();

        System.out.println("Total Price: ₹" + total);
        System.out.println(item.getDiscountDetails());
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + (total - discount));
        System.out.println();
    }

    public static void main(String[] args) {

        FoodItem veg = new VegItem("Veg Burger", 120, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Roll", 150, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}
