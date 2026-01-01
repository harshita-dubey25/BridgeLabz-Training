package com.polymorphismandencapsulation.ECommercePlatform;

class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
