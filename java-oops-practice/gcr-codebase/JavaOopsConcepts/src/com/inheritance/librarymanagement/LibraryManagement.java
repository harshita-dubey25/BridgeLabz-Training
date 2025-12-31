package com.inheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {

        Author bookAuthor = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert Java developer and author"
        );

        bookAuthor.displayInfo();
    }
}

