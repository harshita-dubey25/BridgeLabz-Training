package edumentor;

class Instructor extends User {

    private String specialization;

    public Instructor(int userId, String name, String email, String specialization) {
        super(userId, name, email);
        this.specialization = specialization;
    }

    public void printDetails() {
        System.out.println("Instructor: " + name +
                ", Specialization: " + specialization);
    }
}

