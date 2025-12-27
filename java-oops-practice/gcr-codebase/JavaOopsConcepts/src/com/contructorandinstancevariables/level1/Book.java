package com.contructorandinstancevariables.level1;

public class Book {
	
	String title;
	String author;
	float price;
	
	Book(){
		title = "Atomic Habits";
		author = "James Clear";
		price = 150.0f;
	}
	Book(String title, String author, float price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayBookDetails() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("- - - - - - - - - - - - - -");
	}

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Eat that Frog","Tracy Brian", 250.0f);
		
		b1.displayBookDetails();
		b2.displayBookDetails();
		
	}

}
