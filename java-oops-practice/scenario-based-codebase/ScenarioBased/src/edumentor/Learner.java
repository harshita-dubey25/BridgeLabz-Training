package edumentor;

class Learner extends User implements ICertifiable {

    private String courseType;
    private double progress;

    public Learner(int userId, String name, String email, String courseType) {
        super(userId, name, email);
        this.courseType = courseType;
        this.progress = 0;
    }

    public void updateProgress(double progress) {
        this.progress = progress;
    }

    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("Short")) {
            System.out.println("Certificate of Completion awarded to " + name +
                    " for Short Course.");
        } else {
            System.out.println("Professional Certification awarded to " + name +
                    " for Full-Time Course.");
        }
    }
}

