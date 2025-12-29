package com.contructorandinstancevariables.level1;

public class Library {
    String title;
    String author;
    double price;
    boolean availability;

   
    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; 
    }

   public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book is currently unavailable.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $ " + price);
        System.out.println("Available: " + availability);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
    	Library b = new Library(" Java programing ","Lucky pal",1000000);
    	b.borrowBook();
    	b.displayBook();
    }
}