package com;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class SmartShelf {

    static void insertionSort(Book[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    static void display(Book[] books) {
        for (Book b : books) {
            System.out.println(b.title);
        }
    }

    public static void main(String[] args) {
        Book[] readingList = {
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Artificial Intelligence"),
            new Book("Computer Networks")
        };

        System.out.println("Before Sorting:");
        display(readingList);

        insertionSort(readingList);

        System.out.println("\nAfter Alphabetical Sorting:");
        display(readingList);
    }
}
