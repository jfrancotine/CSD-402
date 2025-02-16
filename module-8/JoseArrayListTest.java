//Jose Franco
//02/16/25
//M8: Programming Assignment - Populating an ArrayList with Integer Data

import java.util.ArrayList;
import java.util.Scanner;

public class JoseArrayListTest {

    // Method to find the maximum value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Return 0 if the list is empty
        }
        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num; // Update if a larger value is found
            }
        }
        return maxValue; // Return the largest value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("\nWelcome to the Array List Program!\n");
        System.out.println("Enter as many integers as desired. Once done, please enter 0 to stop.\n");

        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) { // Check if the input is a valid integer
                int input = scanner.nextInt();
                numbers.add(input); // Add input to the list
                if (input == 0) {
                    break; // Stop input if 0 is entered
                }
            } else {
                System.out.println("\nInvalid input! Please enter an integer.\n");
                scanner.next(); // See the invalid input
            }
        }

        // Display the numbers entered
        System.out.println("\nThe numbers you have entered are: \n" + numbers);

        // Find and display the largest number
        Integer largest = max(numbers);
        System.out.println("\nThe largest number entered is: \n" + largest);
        System.out.println("\nThe Array List Program has ended. Have a great day!\n");

    }
}
