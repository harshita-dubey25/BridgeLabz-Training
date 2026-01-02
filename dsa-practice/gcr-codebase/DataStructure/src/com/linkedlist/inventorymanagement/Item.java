package com.linkedlist.inventorymanagement;

public class Item {
	
	String name;
	int id;
	int quantity;
	float price;
	Item next;
	
	Item(String name, int id, int quantity, float price){
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}
