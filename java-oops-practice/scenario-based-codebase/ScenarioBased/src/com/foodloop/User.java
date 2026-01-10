package foodloop;

import java.util.ArrayList;

public class User {
	private String name;
	private double wallet;
	
	ArrayList<FoodItem> foodItem = new ArrayList<>();
	
	public User(String name, double wallet) {
		super();
		this.name = name;
		this.wallet = wallet;
	}
	public void addItem(FoodItem item) {
		foodItem.add(item);
	}
	
	public boolean cancelItem(String name) {
		for(FoodItem i: foodItem) {
			if(i.getName().equalsIgnoreCase(name)) {
				foodItem.remove(i);
				System.out.println("Order has been cancel "+i.getName());
				return true;
			}
		}
		System.out.println("Food item not found");
		return false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
}