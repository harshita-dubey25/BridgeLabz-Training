package edumentor;

class Quiz {

    private String difficulty;
    private String[] questions;    
    private final int[] answers;   
    private int score;

    public Quiz(String difficulty, String[] questions, int[] answers) {
        this.difficulty = difficulty;
        this.questions = questions;
        this.answers = answers;
        this.score = 0;
    }

    public void attemptQuiz(int[] userAnswers) {
        score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == userAnswers[i]) {
                score++; 
            }
        }
    }
    public double getPercentage() {
        return ((double) score / answers.length) * 100;
    }

    public void showResult() {
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Score: " + score + "/" + answers.length);
        System.out.println("Percentage: " + getPercentage() + "%");
    }
}

