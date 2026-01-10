package skillforge;

public class Student extends User implements ICertifiable {
	private int progress; // percentage
    private int grade;

    public Student(int userId, String name, String email) {
        super(userId, name, email);
        this.progress = 0;
        this.grade = 0;
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " enrolled in course: " + course.getTitle());
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operator usage
    }

    public void assignGrade(int score) {
        grade = score;
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public void generateCertificate() {
        if (progress >= 100 && grade >= 50) {
            System.out.println("Certificate generated for " + name);
        } else {
            System.out.println("Course not completed. Certificate denied.");
        }
    }
    public void login() {
    	System.out.println("Student "+name+" has loggged in successfully.");
    }
}
