package com.polymorphismandencapsulation.library;

class Book extends LibraryItem {

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    
    public int getLoanDuration() {
        return 14; // days
    }
}
