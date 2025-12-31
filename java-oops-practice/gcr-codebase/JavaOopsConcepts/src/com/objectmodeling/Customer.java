package com.objectmodeling;

class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Association: Customer places Order
    public void placeOrder(Order order) {
        System.out.println(name + " placed order with ID: " + order);
    }
}
