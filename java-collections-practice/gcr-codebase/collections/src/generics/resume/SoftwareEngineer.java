package generics.resume;

public class SoftwareEngineer extends JobRole {

	public SoftwareEngineer(String name) {
		super(name);
	}

	@Override
	public void evaluate() {
		System.out.println(name+ " is evaluated for software engineer role");
	}
	
}