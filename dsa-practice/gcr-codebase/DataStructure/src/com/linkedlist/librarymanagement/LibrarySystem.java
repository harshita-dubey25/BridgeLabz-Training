package com.linkedlist.librarymanagement;

public class LibrarySystem {
	private BookNode head;
    private BookNode tail;
    private int count = 0;

    public void addBook(String title, String author, String genre, int id, boolean status) {
        BookNode newNode = new BookNode(title, author, genre, id, status);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    public void removeBook(int id) {
        BookNode curr = head;
        while (curr != null) {
            if (curr.bookID == id) {
                if (curr == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                } else if (curr == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                count--;
                System.out.println("Book ID " + id + " removed.");
                return;
            }
            curr = curr.next;
        }
        System.out.println("Book not found.");
    }

    public void displayForward() {
        BookNode temp = head;
        System.out.println("\n--- Library Catalog (A-Z) ---");
        while (temp != null) {
            System.out.println(temp.bookID + ": " + temp.title + " [" + (temp.isAvailable ? "Available" : "Borrowed") + "]");
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        System.out.println("\n--- Library Catalog (Z-A) ---");
        while (temp != null) {
            System.out.println(temp.bookID + ": " + temp.title);
            temp = temp.prev;
        }
    }

    public void toggleAvailability(int id) {
        BookNode curr = head;
        while (curr != null) {
            if (curr.bookID == id) {
                curr.isAvailable = !curr.isAvailable;
                System.out.println("Status updated for: " + curr.title);
                return;
            }
            curr = curr.next;
        }
    }

    public int getBookCount() { 
    	return count; 
    	}
    
    public void insertAtPosition(int pos, String title, String author, String genre, int id, boolean status) {
        if (pos < 1 || pos > count + 1) return;
        if (pos == 1) { 
        	return;
        	}
        
        BookNode newNode = new BookNode(title, author, genre, id, status);
        BookNode temp = head;
        for (int i = 1; i < pos - 1; i++) temp = temp.next;

        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode; 
        }
        temp.next = newNode;
        count++;
    }
}