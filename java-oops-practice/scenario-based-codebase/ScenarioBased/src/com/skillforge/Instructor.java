package skillforge;

public class Instructor extends User {
	private String expertise;

    public Instructor(int userId, String name, String email, String expertise) {
        super(userId, name, email);
        this.expertise = expertise;
    }

    public void uploadCourse(Course course) {
        System.out.println("Course uploaded by instructor: " + name);
    }
    public void login() {
    	System.out.println("Instructor "+name+" has loggged in successfully.");
    }
}
