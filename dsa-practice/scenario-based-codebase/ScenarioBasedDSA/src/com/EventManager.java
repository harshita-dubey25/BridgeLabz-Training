package com;

class Ticket {
    double price;

    Ticket(double price) {
        this.price = price;
    }
}

public class EventManager {

    static int partition(Ticket[] arr, int low, int high) {
        double pivot = arr[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].price <= pivot) {
                i++;
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(Ticket[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void display(Ticket[] arr) {
        for (Ticket t : arr) {
            System.out.println("₹" + t.price);
        }
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
            new Ticket(2500),
            new Ticket(1200),
            new Ticket(4500),
            new Ticket(800),
            new Ticket(3000)
        };

        System.out.println("Before Sorting:");
        display(tickets);

        quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Price:");
        display(tickets);
    }
}
