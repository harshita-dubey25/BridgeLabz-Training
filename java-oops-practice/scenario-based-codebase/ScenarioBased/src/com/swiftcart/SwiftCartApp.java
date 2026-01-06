package com.swiftcart;

public class SwiftCartApp {

    public static void main(String[] args) {

        Cart cart = new Cart();

        Product apple = new PerishableProduct("Apple", 100, 2);
        Product milk = new PerishableProduct("Milk", 50, 1);
        Product rice = new NonPerishableProduct("Rice", 60, 3);

        cart.addProduct(apple);
        cart.addProduct(milk);
        cart.addProduct(rice);

        cart.generateBill();
    }
}

