package collectionsproblems.MapInterface;

import java.util.*;

public class ShoppingCart {

    private static Map<String, Double> priceMap = new HashMap<>();

    private static Map<String, Double> cartOrder = new LinkedHashMap<>();

    public static void addItem(String product, double price) {
        priceMap.put(product, price);
        cartOrder.put(product, price);
    }

    public static void displayCartOrder() {
        System.out.println("Cart Items (Insertion Order):");
        cartOrder.forEach((k, v) ->
                System.out.println(k + " → ₹" + v));
    }

    public static void displaySortedByPrice() {
        System.out.println("Cart Items (Sorted by Price):");

        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            sortedByPrice
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        sortedByPrice.forEach((price, products) -> {
            for (String p : products) {
                System.out.println(p + " → ₹" + price);
            }
        });
    }

    public static void main(String[] args) {

        addItem("Laptop", 65000);
        addItem("Mouse", 800);
        addItem("Keyboard", 1500);
        addItem("Monitor", 12000);
        addItem("USB Cable", 300);

        displayCartOrder();
        System.out.println();
        displaySortedByPrice();
    }
}
