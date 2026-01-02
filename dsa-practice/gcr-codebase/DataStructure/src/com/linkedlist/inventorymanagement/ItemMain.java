package com.linkedlist.inventorymanagement;

import java.util.Scanner;

public class ItemMain {
		public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        LinkedListFunctions list = new LinkedListFunctions();
		        int choice;

		        do {
		            System.out.println("\n--- Inventory Management Menu ---");
		            System.out.println("1. Add at Beginning");
		            System.out.println("2. Add at End");
		            System.out.println("3. Add at Position");
		            System.out.println("4. Delete by Item Id");
		            System.out.println("5. Search by Item Id");
		            System.out.println("6. Update quantity");
		            System.out.println("7. Display All");
		            System.out.println("8. Calculate Value");
		            System.out.println("9. Sort by Name");
		            System.out.println("0. Exit");
		            System.out.print("Enter choice: ");
		            System.out.println();
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                case 2:
		                case 3:
		                	System.out.print("Name: ");
		                    String name = sc.next();
		                    System.out.print("Item Id: ");
		                    int id = sc.nextInt();
		                    System.out.print("Quantity: ");
		                    int quantity = sc.nextInt();
		                    System.out.print("Price: ");
		                    float price = sc.nextFloat();

		                    if (choice == 1)
		                        list.addItemAtBeginning(name,id,quantity,price);
		                    else if (choice == 2)
		                        list.addItemAtEnd(name,id,quantity,price);
		                    else {
		                        System.out.print("Position: ");
		                        int pos = sc.nextInt();
		                        list.addItemAtMiddle(pos, name,id,quantity,price);
		                    }
		                    break;

		                case 4:
		                    System.out.print("Enter Item Id to delete: ");
		                    list.deleteByItemid(sc.nextInt());
		                    break;

		                case 5:
		                    System.out.print("Enter Item id to search: ");
		                    list.searchById(sc.nextInt());
		                    break;

		                case 6:
		                    System.out.print("Enter Item Id: ");
		                    int itemid = sc.nextInt();
		                    System.out.print("New Quantity: ");
		                    int q = sc.nextInt();
		                    list.updateQuantity(itemid,q);
		                    break;

		                case 7:
		                    list.display();
		                    break;
		                    
		                case 8:
		                	list.calculateValue();
		                	break;
		                
		                case 9:
		                	System.out.println("Enter true for ascending order and false for vise-versa");
		                	list.sortByName(sc.nextBoolean());
		                	break;

		                case 0:
		                    System.out.println("Exiting program...");
		                    break;

		                default:
		                    System.out.println("Invalid choice.");
		            }
		        } while (choice != 0);

		        sc.close();
		}

}
