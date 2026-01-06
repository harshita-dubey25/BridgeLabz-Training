package com.swiftcart;

class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, int quantity) {
        super(name, price, "Perishable", quantity);
    }
    public double getDiscount() {
        return getTotalPrice() * 0.10;
    }
    
}
