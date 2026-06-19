import java.util.*;
public class RockSissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] gameChoices = {"Rock", "Paper", "Scissors"};
        while (true) {
            Random random = new Random();

            int computerChoice = random.nextInt(gameChoices.length);

            System.out.println("Enter your choice:\n 1 for Rock\n 2 for Paper\n 3 for Scissors");
            int userChoice = sc.nextInt() - 1; // Convert user input to match array indexing

            if (userChoice < 0 || userChoice >= gameChoices.length) {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                return;
            }

            System.out.printf("You chose %s, Computer chose %s.\n", gameChoices[userChoice], gameChoices[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie! 🤝");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("You lose! 😢");
            }
        }
    }
}
