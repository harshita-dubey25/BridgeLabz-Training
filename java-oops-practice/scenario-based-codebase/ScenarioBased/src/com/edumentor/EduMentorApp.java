package edumentor;

public class EduMentorApp {

    public static void main(String[] args) {

        Learner learner = new Learner(1, "Harshita", "harshita@edumentor.com", "Full");
        Instructor instructor = new Instructor(101, "Dr. Mehta", "mehta@edumentor.com", "AI");

        String[] questions = {
            "What is AI?",
            "What is ML?",
            "What is Deep Learning?"
        };

        int[] correctAnswers = {1, 2, 3}; // Encapsulated answers
        int[] userAnswers = {1, 2, 3};

        Quiz quiz = new Quiz("Medium", questions, correctAnswers);

        quiz.attemptQuiz(userAnswers);
        quiz.showResult();

        learner.generateCertificate();
        instructor.printDetails();
    }
}

