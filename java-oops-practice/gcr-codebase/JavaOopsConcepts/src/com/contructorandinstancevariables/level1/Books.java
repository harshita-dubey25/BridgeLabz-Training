package com.contructorandinstancevariables.level1;

public class Books {
	
	String title;
	String author;
	float price;
	boolean availability;
	
	Books(String title, String author, float price,boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	void checkAvailability() {
		if(availability) {
			System.out.println("Borrowed...");
		}
		else {
			System.err.println("Sorry, this book is currently unavailable!!!");
		}
	}
	void displayBookDetails() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        checkAvailability();
        System.out.println("- - - - - - - - - - - - - -");
	}

	public static void main(String[] args) {
		Books b1 = new Books("Atomic Habits","James Clear",150, true);
		Books b2 = new Books("Eat that Frog","Tracy Brian", 250.0f,false);
		Books b3 = new Books("The Power of Habit","	Charles Duhigg",350, true);
		Books b4 = new Books("How to Win Friends and Influence People","Dales Carnegi", 280.0f,false);
		
		b1.displayBookDetails();
		b2.displayBookDetails();
		b3.displayBookDetails();
		b4.displayBookDetails();
		
	}

}
