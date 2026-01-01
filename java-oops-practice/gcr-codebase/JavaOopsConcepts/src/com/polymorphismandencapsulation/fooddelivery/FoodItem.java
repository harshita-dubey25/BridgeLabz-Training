package com.polymorphismandencapsulation.fooddelivery;

abstract class FoodItem implements Discountable {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Encapsulated access for subclasses
    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
}
