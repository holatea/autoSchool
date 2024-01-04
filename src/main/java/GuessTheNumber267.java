import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret;

        // Generate a number from 0 to 20
        secret = random.nextInt(20 + 1);

        int attempts = 0;

        while (attempts < 7) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secret) {
                System.out.println("You guessed right :)");
                return;
            } else if (guess < secret) {
                System.out.println("Not enough");
            } else {
                System.out.println("A lot");
            }
        }

        System.out.println("Didn't guess correctly :(");
    }
}
