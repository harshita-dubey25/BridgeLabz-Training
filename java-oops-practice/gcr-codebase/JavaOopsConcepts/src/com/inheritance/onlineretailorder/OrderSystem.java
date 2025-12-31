package com.inheritance.onlineretailorder;

public class OrderSystem {
    public static void main(String[] args) {

        Order order = new Order(101, "01-03-2025");
        ShippedOrder shipped = new ShippedOrder(102, "02-03-2025", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(
                103, "03-03-2025", "TRK67890", "05-03-2025");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
