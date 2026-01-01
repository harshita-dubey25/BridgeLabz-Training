package com.polymorphismandencapsulation.ECommercePlatform;

class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }
    
    public String getTaxDetails() {
        return "Clothing GST: 12%";
    }
}

