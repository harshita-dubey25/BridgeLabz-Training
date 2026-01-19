package generics.smartWareHouseSystem;

public class Electronics extends WareHouseItem{
	
	public Electronics(String name, int quantity) {
		super(name, quantity);
	}
	
	@Override
	public String getCategory() {
		return "Electronics";
	}
}