package com.polymorphismandencapsulation.ECommercePlatform;

public class ECommercePlatform {
    public static void main(String[] args) {

        Product[] products = {
            new Electronics(101, "Laptop", 60000),
            new Clothing(102, "Jacket", 4000),
            new Groceries(103, "Rice Bag", 1200)
        };

        BillingService.calculateFinalPrice(products);
    }
}
