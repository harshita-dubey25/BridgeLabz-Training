package com.objectmodeling.library;

import java.util.ArrayList;

class Library {
    private String libraryName;
    private ArrayList<Book> books; // Aggregation

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getDetails() + " added to " + libraryName);
    }

    public void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book b : books) {
            System.out.println("- " + b.getDetails());
        }
    }
}

