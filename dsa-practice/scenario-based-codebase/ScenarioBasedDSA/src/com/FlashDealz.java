package com;

class Product {
    String name;
    int discount;

    Product(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " - " + discount + "%";
    }
}

public class FlashDealz {

    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(Product[] arr, int low, int high) {
        int pivot = arr[high].discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].discount > pivot) {
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product("Laptop", 40),
                new Product("Phone", 60),
                new Product("Shoes", 30),
                new Product("Headphones", 50)
        };

        quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

