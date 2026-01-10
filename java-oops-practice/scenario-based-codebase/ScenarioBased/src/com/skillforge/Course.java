package skillforge;

class Course {
    private String title;
    private Instructor instructor;
    protected double rating; // protected for encapsulation
    private Module[] modules;
    private final String[] reviews; // read-only internal reviews

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new Module[0];
        this.reviews = new String[]{"Good", "Very Informative"};
        this.rating = 4.0;
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, Module[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Excellent", "Well Structured"};
        this.rating = 4.5;
    }

    public String getTitle() {
        return title;
    }

    // Protected rating logic
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = newRating;
        }
    }

    // Read-only access to reviews
    public String[] getReviews() {
        return reviews;
    }

    public int getTotalModules() {
        return modules.length;
    }
}

