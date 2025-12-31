package com.objectmodeling;

import java.util.ArrayList;

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Aggregation: Order contains Products
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to order");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

