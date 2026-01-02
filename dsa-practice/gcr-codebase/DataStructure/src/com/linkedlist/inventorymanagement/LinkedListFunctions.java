package com.linkedlist.inventorymanagement;

import com.linkedlist.inventorymanagement.Item;

public class LinkedListFunctions {
	
	private Item head;
	
	public void addItemAtBeginning(String name, int id, int quantity, float price) {
		Item newNode = new Item(name,id,quantity,price);	
		newNode.next = head;
		head = newNode;
		System.out.println("Item added at the beginning.");
	}
	
	public void addItemAtEnd(String name, int id, int quantity, float price) {
		Item newNode = new Item(name,id,quantity,price);	
		
		if(head==null) {
			head= newNode;
			return;
		}
		Item temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		System.out.println("Item added at the end.");
	}
	
	public void addItemAtMiddle(int position, String name, int id, int quantity, float price) {
			
		if(position<=0) {
			System.out.println("Invalid Position!!!");
			return;
		}
		if(position ==1) {
			addItemAtBeginning(name,id,quantity,price);
			return;
		}
		Item newNode = new Item(name,id,quantity,price);	
		Item temp = head;
		
		while(position-1>1 && temp!=null) {
			temp = temp.next;
		}
		if(temp ==null) {
			System.out.println("Position out of range!!!");
		}
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Item added at Position:"+position);
	}
	
	public void deleteByItemid(int id) {
		if(head==null) {
			System.out.println("List id empty!!!");
			return;
		}
		if(head.id==id) {
			head = head.next;
			System.out.println("Item record deleted.");
			return;
		}
		Item temp = head;
		while(temp.next!=null && temp.next.id!=id) {
			temp = temp.next;
		}
		if(temp.next==null) {
			System.out.println("Item record does not exist!!!");
			return;
		}
		temp.next = temp.next.next;
		System.out.println("Item record deleted.");
	}
	
	public void searchById(int id) {
		Item temp = head;
		
		while(temp!=null) {
			if(temp.id ==id) {
				System.out.println("Record Found");
				System.out.println("Item Id: "+temp.id);
				System.out.println("Name: "+temp.name);
				System.out.println("Quantity: "+temp.quantity);
				System.out.println("Price: "+temp.price);
				return;
			}
			temp=temp.next;
		}
		System.out.println("Item not found!!!");
	}
	public void display() {
		if(head == null) {
			System.out.println("Empty list!!!");
		}
		Item temp = head;
		while(temp!=null) {
			System.out.println("Item Id: "+temp.id);
			System.out.println("Name: "+temp.name);
			System.out.println("Quantity: "+temp.quantity);
			System.out.println("Price: "+temp.price);
			System.out.println("_ _ _ _ _ _ _ _ _ _ _");
			temp = temp.next;
		}
	}
	
	public void updateQuantity(int id, int quantity) {
		Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                System.out.println("Quantity updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
	}
	
	public void calculateValue() {
		double total = 0;
		Item temp = head;
		while(temp!=null) {
			float value = temp.quantity*temp.price;
			total+=value;
			System.out.println("Price value of ItemId: "+ temp.id);
			System.out.println("Rs"+value);
			temp=temp.next;
		}
		System.out.println("Total Inventory value: Rs"+total);
	}
	
	public void swapData(Item a, Item b) {
        int id = a.id;
        String name = a.name;
        int qty = a.quantity;
        float price = a.price;

        a.id = b.id;
        a.name = b.name;
        a.quantity = b.quantity;
        a.price = b.price;

        b.id = id;
        b.name = name;
        b.quantity = qty;
        b.price = price;
    }
	public void sortByName(boolean ascending) {
        for (Item i = head; i != null; i = i.next) {
            for (Item j = i.next; j != null; j = j.next) {
                if ((ascending && i.name.compareToIgnoreCase(j.name) > 0) ||
                    (!ascending && i.name.compareToIgnoreCase(j.name) < 0)) {
                    swapData(i, j);
                }
            }
        }
        System.out.println("Sorted by Item Name.");
    }

}
