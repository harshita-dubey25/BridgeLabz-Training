package com.classandobject.level1;

public class HandBook {
	String bookTitle;
	String bookAuthor;
	double price;
	
	
	HandBook(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);

}
}