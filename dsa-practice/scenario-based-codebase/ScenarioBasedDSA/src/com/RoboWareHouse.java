package com;

class Package {
    int weight;

    Package(int weight) {
        this.weight = weight;
    }
}

public class RoboWareHouse {

    static void insertionSort(Package[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Package key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].weight > key.weight) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void display(Package[] arr) {
        for (Package p : arr) {
            System.out.print(p.weight + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Package[] shelf = {
            new Package(30),
            new Package(20),
            new Package(40),
            new Package(10)
        };

        insertionSort(shelf);
        display(shelf);
    }
}
