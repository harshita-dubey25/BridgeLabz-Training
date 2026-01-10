package foodloop;

public class NonVegItem extends FoodItem{

	public NonVegItem(String name, String category, boolean availability,  double price) {
		super(name, category, price, availability);
	}
	@Override
	public void display() {
		System.out.println("\n-----------Non Veg item details-----------");
		super.display();
	}
}