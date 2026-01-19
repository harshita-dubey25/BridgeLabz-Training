package com;

class Transaction {
    String date;   
    double amount;

    Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }
}

public class ZipZipMart {

    static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Transaction[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].date.compareTo(R[j].date) < 0 ||
               (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void display(Transaction[] arr) {
        for (Transaction t : arr) {
            System.out.println(t.date + " - ₹" + t.amount);
        }
    }

    public static void main(String[] args) {
        Transaction[] records = {
            new Transaction("2025-01-12", 450.00),
            new Transaction("2025-01-10", 1200.50),
            new Transaction("2025-01-12", 300.00),
            new Transaction("2025-01-09", 800.00)
        };

        System.out.println("Before Sorting:");
        display(records);

        mergeSort(records, 0, records.length - 1);

        System.out.println("\nAfter Sorting by Date and Amount:");
        display(records);
    }
}

