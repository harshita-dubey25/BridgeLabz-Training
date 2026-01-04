package com.linkedlist.librarymanagement;

import java.util.*;

public class BookMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibrarySystem library = new LibrarySystem();

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        library.addBook("1984", "George Orwell", "Dystopian", 102, true);
        library.addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy", 103, false);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add Book (End)");
            System.out.println("2. Remove Book (by ID)");
            System.out.println("3. Display All (Forward)");
            System.out.println("4. Display All (Reverse)");
            System.out.println("5. Toggle Availability Status");
            System.out.println("6. Show Total Book Count");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Title: "); String title = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();
                    System.out.print("Genre: "); String genre = sc.nextLine();
                    System.out.print("ID: "); int id = sc.nextInt();
                    library.addBook(title, author, genre, id, true);
                    System.out.println("Book added!");
                }
                case 2 -> {
                    System.out.print("Enter Book ID to remove: ");
                    int id = sc.nextInt();
                    library.removeBook(id);
                }
                case 3 -> library.displayForward();
                case 4 -> library.displayReverse();
                case 5 -> {
                    System.out.print("Enter Book ID to update: ");
                    int id = sc.nextInt();
                    library.toggleAvailability(id);
                }
                case 6 -> System.out.println("Total Books: " + library.getBookCount());
                case 7 -> {
                    exit = true;
                    System.out.println("System closed.");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}