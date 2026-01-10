package skillforge;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(
                101, "Dr. Sharma", "sharma@skillforge.com", "Java");

        Module[] modules = {
                new Module("OOPS Basics", 60),
                new Module("Advanced Java", 90)
        };

        Course course = new Course("Java Mastery", instructor, modules);

        Student student = new Student(
                201, "Harshita", "harshita@student.com");

        student.login();
        student.enrollCourse(course);

        student.updateProgress(2, course.getTotalModules());
        student.assignGrade(85);

        System.out.println("Progress: " + student.getProgress() + "%");

        student.generateCertificate();
    }
}
