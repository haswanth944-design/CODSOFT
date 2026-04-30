import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean guessed = false;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i + ": ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct!");
                    score++;
                    guessed = true;
                    break;
                } 
                else if (guess > number) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Too low!");
                }
            }

            if (!guessed) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.print("Play again? (yes/no): ");
            String choice = sc.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Final Score: " + score);
        sc.close();
    }
}
