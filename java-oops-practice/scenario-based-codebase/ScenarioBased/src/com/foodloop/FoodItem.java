package foodloop;

public class FoodItem {
	public String name;
	public String category;
	public double price;
	public boolean availability;
	
	public FoodItem(String name, String category, double price, boolean availability) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setAvailability(boolean isAvailable) {
		availability = isAvailable;
	}
	public boolean isAvailable() {
		return availability;
	}
	
	public void display() {
		System.out.println("Food name    : "+name);
		System.out.println("Category     : "+category);
		System.out.println("Price        : "+price);
		System.out.println("Availability : "+availability);
	}
}