package com.polymorphismandencapsulation.library;

class DVD extends LibraryItem {

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // days
    }
}
