package guesspack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> guesses = new ArrayList<>();

        int target = rand.nextInt(100) + 1;  // random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            guesses.add(guess);  // Store the guess
            attempts++;

            if (guess == target) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < target) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("\nYour guesses: " + guesses);
        sc.close();
    }
}