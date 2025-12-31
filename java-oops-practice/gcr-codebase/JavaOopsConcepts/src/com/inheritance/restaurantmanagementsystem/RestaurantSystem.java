package com.inheritance.restaurantmanagementsystem;

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Harshita",501);
        Worker waiter = new Waiter("Ansh",101);

        chef.performDuties();
        waiter.performDuties();
    }
}

