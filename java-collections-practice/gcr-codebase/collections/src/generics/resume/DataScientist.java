package generics.resume;

public class DataScientist extends JobRole{

	public DataScientist(String name) {
		super(name);
	}

	@Override
	public void evaluate() {
		System.out.println(name+ " is eveluated for datascientist role");
	}

}