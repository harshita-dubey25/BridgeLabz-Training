package com;

import java.util.*;

public class BookShelf {

    private static HashMap<String, LinkedList<String>> catalog = new HashMap<>();

    private static HashSet<String> uniqueBooks = new HashSet<>();

    private static ArrayList<String> bookHistory = new ArrayList<>();

    public static void addBook(String genre, String bookName) {
        if (uniqueBooks.contains(bookName)) {
            System.out.println("Duplicate book not allowed: " + bookName);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(bookName);     
        uniqueBooks.add(bookName);            
        bookHistory.add(bookName);            

        System.out.println("Book added: " + bookName);
    }

    public static void borrowBook(String genre, String bookName) {
        if (catalog.containsKey(genre) && catalog.get(genre).remove(bookName)) {
            uniqueBooks.remove(bookName);
            System.out.println("Book borrowed: " + bookName);
        } else {
            System.out.println("Book not available.");
        }
    }

    public static void displayCatalog() {
        System.out.println("\n📖 Library Catalog:");
        for (Map.Entry<String, LinkedList<String>> entry : catalog.entrySet()) {
            System.out.println("Genre: " + entry.getKey());
            for (String book : entry.getValue()) {
                System.out.println("  - " + book);
            }
        }
    }

    public static void showBookHistory() {
        System.out.println("\n📜 Book History:");
        for (String book : bookHistory) {
            System.out.println(book);
        }
    }

    // Main Method
    public static void main(String[] args) {
    	
    	Scanner input =  new Scanner(System.in);
    	String option = "yes";
    	
    	System.out.println("---------- Welcome to Book Shelf Library ----------");
    	do {
    		System.out.println("1. Add Book");
    		System.out.println("2. Borrow Book");
    		System.out.println("3. Display Catalog");
    		System.out.println("4. Show Book History");
    		System.out.println();
    		System.out.print("Enter yout choice: ");
    		
    		int a = input.nextInt();
    		
    		
    		switch(a) {
    		case 1:
    			System.out.print("Genre Name: ");
    			String genre = input.next();
    			//input.nextLine();
    			System.out.print("Book Name: ");
    			String name = input.nextLine();
    			addBook(genre,name);
    			break;
    		case 2:
    			System.out.println("Genre Name: ");
    			String g = input.next();
    			input.nextLine();
    			System.out.println("Book Name: ");
    			String n = input.nextLine();
    			input.nextLine();
    			borrowBook(g,n);
    			break;
    		case 3:
    			displayCatalog();
    			break;
    		case 4:
    			showBookHistory();
    		default:
    			System.out.println("Invalid choice!!!");
    		}
    		
    		System.out.println("Do you want to continue?\nType yes/no.");
    		option = input.next();
    	}while (option.equals("yes"));

       // addBook("Fiction", "The Alchemist");
      //  addBook("Fiction", "1984");
       // addBook("Programming", "Clean Code");
       // addBook("Fiction", "The Alchemist"); // Duplicate

      //  displayCatalog();

      //  borrowBook("Fiction", "1984");

       // displayCatalog();
     //   showBookHistory();
    }
}
