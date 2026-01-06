package com.swiftcart;

import java.util.*;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;   

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }
    
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    public double applyDiscount() {
        double discount = 0;
        for (Product p : products) {
            discount += p.getDiscount(); 
        }
        return discount;
    }

    public void generateBill() {
        System.out.println("\n===== SwiftCart Bill =====");
        for (Product p : products) {
            System.out.println(
                p.getName() + " | Qty: " + p.quantity +
                " | Price: " + p.getTotalPrice()
            );
        }

        double discount = applyDiscount();
        double finalAmount = totalPrice - discount; 

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}
