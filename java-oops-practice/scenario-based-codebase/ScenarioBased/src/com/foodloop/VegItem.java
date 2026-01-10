package foodloop;


public class VegItem extends FoodItem{

	public VegItem(String name, String category, boolean availability, double price) {
		super(name, category, price, availability);
	}
	
	@Override
	public void display() {
		System.out.println("\n-----------Veg item details-----------");
		super.display();
	}
}
