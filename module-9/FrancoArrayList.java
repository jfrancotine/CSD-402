// Jose Franco
// 02/16/2025
// M9 - Programming Assignment 1 - Array List with Try/Catch and Auto-boxing

import java.util.ArrayList;
import java.util.Scanner;

public class FrancoArrayList {
    public static void main(String[] args) {

        // Create an ArrayList with 10 String elements
        ArrayList<String> items = new ArrayList<>();
        items.add("0. Smells Like Teen Spirit");
        items.add("1. Wannabe");
        items.add("2. Creep");
        items.add("3. Barbie Girl");
        items.add("4. Bittersweet Symphony");
        items.add("5. Don't Speak");
        items.add("6. Candle in the Wind 1997");
        items.add("7. I Will Always Love You");
        items.add("8. Losing My Religion");
        items.add("9. I Want It That Way\n");

        // Welcome message
        System.out.println("\nWelcome to the Array List Program\n");

        // Print elements using for-each loop
        System.out.println("Elements available in the array:\n");
        for (String item : items) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);
        boolean continuePicking = true;

        while (continuePicking) {
            Integer index = null;

            // Get user input with validation
            while (index == null) {
                System.out.print("Please, enter an index (0-9) to see the element that you would like to see again: ");

                if (scanner.hasNextInt()) {  // Check if input is an integer
                    index = scanner.nextInt();  // Auto-boxing

                    // Try/Catch block to handle out-of-bounds errors
                    try {
                        System.out.println("\nYou selected: " + items.get(index) + ". That is a great song.");  // Auto-unboxing Integer back to int
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("\nException thrown: Out of Bounds.");
                        index = null;  // Reset index to re-prompt user
                    }
                } else {
                    System.out.println("\nInvalid input.");
                    scanner.next();  // Clear invalid input
                }
            }

            // Ask if the user wants to pick again
            System.out.print("\nWould you like to pick another song? (y/n): ");
            scanner.nextLine();  // Consume newline left-over
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("y")) {
                continuePicking = false;
                System.out.println("\nThank you for using the Array List Program. Goodbye!\n");
            }
        }

        scanner.close();
    }
}
