package com.objectmodeling;

public class ECommercePlatform {
    public static void main(String[] args) {

        Customer customer = new Customer(101, "Harshita");

        Product p1 = new Product(1, "Laptop", 65000);
        Product p2 = new Product(2, "Mouse", 1200);
        Product p3 = new Product(3, "Keyboard", 2500);

        Order order = new Order(5001);

        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        customer.placeOrder(order);

        System.out.println("Total Order Amount: ₹" + order.calculateTotal());
    }
}
