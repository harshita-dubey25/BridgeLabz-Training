package com.polymorphismandencapsulation.library;

public class LibrarySystem {
    public static void main(String[] args) {

        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M202", "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            item.reserveItem("Amit");
            System.out.println();
        }
    }
}
