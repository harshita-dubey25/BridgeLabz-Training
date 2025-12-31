package com.objectmodeling.library;

public class LibrarySystem {
    public static void main(String[] args) {

        // Books exist independently
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // Same book in another library (aggregation)

        lib1.showBooks();
        lib2.showBooks();
    }
}
