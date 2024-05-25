import java.util.Scanner;
import java.util.Random;

public class Numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to NUMBER GAME!");

        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            final int max = 4;
            System.out.println("Guess the number between 1 and 100:");

            while (attempts < max) {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            }

            if (attempts == max) {
                System.out.println("You ran out of attempts. The correct number was " + secretNumber + ".");
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
