package com;

class Book1 {
    String title;

    Book1(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

public class SmartLibrary {
    public static void insertionSort(Book1[] books) {

        for (int i = 1; i < books.length; i++) {
            Book1 key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Book1[] borrowedBooks = {
                new Book1("Algorithms"),
                new Book1("Data Structures"),
                new Book1("Operating Systems"),
                new Book1("Computer Networks")
        };

        Book1 newBook = new Book1("Artificial Intelligence");

        Book1[] updatedList = new Book1[borrowedBooks.length + 1];
        System.arraycopy(borrowedBooks, 0, updatedList, 0, borrowedBooks.length);
        updatedList[borrowedBooks.length] = newBook;

        insertionSort(updatedList);

        System.out.println("Borrowed books (Alphabetically Sorted):");
        for (Book1 b : updatedList) {
            System.out.println(b);
        }
    }
}
