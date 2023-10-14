import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minNum = 1;
        int maxNum = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;
        
        System.out.println("Welcome to the Guess the Number game!");
        
        while (true) {
            int targetNumber = random.nextInt(maxNum - minNum + 1) + minNum;
            int attempts = 0;
            
            System.out.println("I'm thinking of a number between " + minNum + " and " + maxNum + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    rounds++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        
        System.out.println("Thanks for playing! You won " + rounds + " round(s) with a total score of " + totalAttempts + " attempts.");
        
        scanner.close();
    }
}
