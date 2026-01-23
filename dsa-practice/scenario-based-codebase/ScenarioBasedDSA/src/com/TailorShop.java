package com;
import java.util.ArrayList;

class Order {
    int orderId;
    int deliveryDay; // smaller = earlier deadline

    Order(int orderId, int deliveryDay) {
        this.orderId = orderId;
        this.deliveryDay = deliveryDay;
    }

    @Override
    public String toString() {
        return "Order " + orderId + " → Delivery Day: " + deliveryDay;
    }
}

public class TailorShop {

    public static void insertionSort(ArrayList<Order> orders) {
        for (int i = 1; i < orders.size(); i++) {
            Order key = orders.get(i);
            int j = i - 1;

            while (j >= 0 && orders.get(j).deliveryDay > key.deliveryDay) {
                orders.set(j + 1, orders.get(j));
                j--;
            }
            orders.set(j + 1, key);
        }
    }

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(101, 2));
        orders.add(new Order(102, 4));
        orders.add(new Order(103, 6));

        // New order arrives
        orders.add(new Order(104, 3));

        insertionSort(orders);

        System.out.println("🧵 Orders Sorted by Delivery Deadline:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
