package com;

class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return name + " - Sold: " + sales;
    }
}

public class IceCreamRush {

    public static void bubbleSort(Flavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].sales > flavors[j + 1].sales) {
                    // swap
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Flavor[] flavors = {
                new Flavor("Vanilla", 120),
                new Flavor("Chocolate", 200),
                new Flavor("Strawberry", 90),
                new Flavor("Mango", 150),
                new Flavor("Butterscotch", 180),
                new Flavor("Pista", 110),
                new Flavor("Black Currant", 70),
                new Flavor("Coffee", 160)
        };

        bubbleSort(flavors);

        System.out.println("Flavors sorted by popularity:");
        for (Flavor f : flavors) {
            System.out.println(f);
        }
    }
}
