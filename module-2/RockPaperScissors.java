// Jose Franco
// 01/17/2025
// M2: Assignment - Rock, Paper, Scissors.

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Welcome message to the game
        System.out.println("\nWelcome to Rock-Paper-Scissors!\n");

        // Using boolean to ask user if they want to play again.
        boolean playAgain = true;

        while (playAgain) {
            // Generate computer's selection using Math.random()
            int computerChoice = (int) (Math.random() * 3) + 1;

            // Prompt user for their choice. It will be validated in a loop until correct input is made.
            int userChoice = 0;
            while (true) {
                System.out.print("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors: ");
                if (scanner.hasNextInt()) {
                    userChoice = scanner.nextInt();
                    if (userChoice >= 1 && userChoice <= 3) {
                        break; // Exit loop if input is valid
                    } else {
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.\n");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number (1, 2, or 3).\n");
                    scanner.next();
                }
            }

            // Display choices
            String userChoiceString = choiceToString(userChoice);
            String computerChoiceString = choiceToString(computerChoice);

            System.out.println("\nYou chose: " + userChoiceString);
            System.out.println("Computer chose: " + computerChoiceString);

            // Determine the winner
            String result;
            switch (determineWinner(userChoice, computerChoice)) {
                case "tie":
                    result = "\nIT IS A TIE!\n";
                    break;
                case "user":
                    result = "\nYOU WIN!\n";
                    break;
                case "computer":
                    result = "\nCOMPUTER WINS!\n";
                    break;
                default:
                    result = "None.";
                    break;
            }

            System.out.println(result);

            // Asking if user wants to play again
            System.out.print("Do you want to play again? (yes or no): ");
            String response = scanner.next().toLowerCase();

            if (!(response.equals("yes")|| response.equals("y"))) {
                playAgain = false;
                System.out.println("\nThank you for playing Rock-Paper-Scissors! Goodbye!\n");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Convert numeric choice to string representation
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "None";
        }
    }

    // If statements to determine winner.
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "tie";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            return "user";
        } else {
            return "computer";
        }
    }
}
