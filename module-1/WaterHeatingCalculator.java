// Jose Franco
// M1: Programming Assignment
// 01/11/2025
// Program that will calculate the energy needed to heat water from an initial temperature to a final temperature.

import java.util.Scanner;

public class WaterHeatingCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        double waterMass = 0;
        double initialTemp = 0;
        double finalTemp = 0;

        System.out.print("\nWelcome to the Energy Calculator\n"); // Welcome message.
        
        // Loop to get a valid water mass
        while (true) {
            System.out.print("\nEnter the amount of water in kilograms: ");
            try {
                waterMass = scanner.nextDouble();
                if (waterMass <= 0) {
                    System.out.println("The amount of water must be greater than zero. Please try again.");
                } else {
                    break; // Valid input, exit the loop
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        // Loop to get a valid initial temperature
        while (true) {
            System.out.print("\nEnter the initial temperature of the water in Celsius: ");
            try {
                initialTemp = scanner.nextDouble();
                break; // Valid input, exit the loop
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        // Loop to get a valid final temperature
        while (true) {
            System.out.print("\nEnter the final temperature of the water in Celsius: ");
            try {
                finalTemp = scanner.nextDouble();
                break; // Valid input, exit the loop
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        // Calculate the energy needed
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display the result
        System.out.printf(
            "The energy needed to heat %.2f kg of water from %.2f°C to %.2f°C is %.2f Joules.%n\n",
            waterMass, initialTemp, finalTemp, Q
        );

        System.out.print("Thank your for using the Energy Calculator. Have a nice day.\n");

        // Close the scanner
        scanner.close();
    }
}
