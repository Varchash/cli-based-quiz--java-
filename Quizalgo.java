import java.util.ArrayList;
import java.util.Scanner;

public class Quizalgo {
    private ArrayList<ques> questions;
    private int score;
    private Scanner scanner;

    // Constructor
    public Quizalgo(Scanner scanner) {
        this.questions = new ArrayList<>();
        this.score = 0;
        this.scanner = scanner;
        initializeQuestions();
    }

    //all quiz questions
    private void initializeQuestions() {
        questions.add(new ques(
            "1. What is the capital of India?",
            new String[]{"A. New Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai"},
            0
        ));

        questions.add(new ques(
            "2. What is 2 + 8?",
            new String[]{"A. 10", "B. 12", "C. 14", "D. 16"},
            0
        ));

        questions.add(new ques(
            "3. What is the largest planet in our solar system?",
            new String[]{"A. Earth", "B. Jupiter", "C. Saturn", "D. Mars"},
            1
        ));

        questions.add(new ques(
            "4. Earth is the third planet from the Sun. True or False?",
            new String[]{"A. True", "B. False"},
            0
        ));
    }

    //welcome message
    public void displayWelcome() {
        System.out.println("\n=====================");
        System.out.println("Welcome to the Quiz!");
        System.out.println("=====================\n");
    }

    //main 
    public void startQuiz() throws InterruptedException {
        for (int i = 0; i < questions.size(); i++) {
            ques q = questions.get(i);
            
            //sq
            q.display();
            
            // input
            System.out.print("Enter your answer (A/B/C/D): ");
            String userInput = scanner.nextLine().toUpperCase().trim();
            int guess = convertAnswerToIndex(userInput);

            // ci
            if (guess == -1) {
                System.out.println("❌ Invalid input! Please enter A, B, C, or D.");
                i--; 
            } else {
                // ca
                if (q.isCorrect(guess)) {
                    score++;
                    System.out.println("✓ Correct answer!\n");
                } else {
                    System.out.println("✗ Incorrect answer! The correct answer is: " 
                        + q.getOptions()[q.getCorrectAnswer()] + "\n");
                }
                Thread.sleep(500);
            }
        }
    }

    private int convertAnswerToIndex(String answer) {
        switch (answer) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            default:
                return -1;
        }
    }
    public void displayScore() {
        System.out.println("=====================");
        System.out.println("Quiz Complete!");
        System.out.println("=====================");
        System.out.println("Your score: " + score + " out of " + questions.size());
        double percentage = (score * 100.0) / questions.size();
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("=====================\n");
    }

    // Get score
    public int getScore() {
        return score;
    }

    // Get total questions
    public int getTotalQuestions() {
        return questions.size();
    }
}
