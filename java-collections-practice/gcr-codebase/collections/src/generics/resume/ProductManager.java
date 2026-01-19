package generics.resume;

public class ProductManager extends JobRole{

	public ProductManager(String name) {
		super(name);
	}

	@Override
	public void evaluate() {
		System.out.println(name+" is eveluated for ProductManager role");
		
	}

}