package com.polymorphismandencapsulation.library;

abstract class LibraryItem implements Reservable {

    private String itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulated)
    private String borrowerName;
    private boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            this.isAvailable = false;
            System.out.println("Item reserved by " + borrowerName);
        } else {
            System.out.println("Item is already reserved");
        }
    }

   
    public boolean checkAvailability() {
        return isAvailable;
    }
}
