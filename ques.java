public class ques {
    private String question;
    private String[] options;
    private int correctAnswer;

    public ques(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    // Display options
    public void display() {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
    }

    //answer is correct
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}
