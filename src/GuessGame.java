import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private static GuessGame instance = new GuessGame();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {

    }

    public static GuessGame getInstance() {

        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }


    public int getScore() {
        return score;
    }

    public void play() {

        for(int i  = 0; i<10; i++) {
            int number = random.nextInt(9);
            System.out.print("Guess a number: ");
            int quess = scanner.nextInt();

            if(number==quess) {
                System.out.println("Bull's eye!");
                score++;
            } else {
                System.out.println("miss, it was all about " + number);
            }
        }

        System.out.println("Your score: " + score);


    }
}
