import java.util.Scanner;

public class Quizm {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Quizalgo quiz = new Quizalgo(scanner);
        quiz.displayWelcome();
        quiz.startQuiz();
        quiz.displayScore();
        scanner.close();
    }
}
