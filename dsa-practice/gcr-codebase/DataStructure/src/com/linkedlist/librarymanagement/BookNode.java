package com.linkedlist.librarymanagement;

public class BookNode {
	public String title;
    public String author;
    public String genre;
    public int bookID;
    public boolean isAvailable;
    
    public BookNode next;
    public BookNode prev;

    public BookNode(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}