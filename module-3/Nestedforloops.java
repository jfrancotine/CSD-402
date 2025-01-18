// Jose Franco
// 01/17/2025
// M3: Assignment - Nested for Loops

public class Nestedforloops {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        // Showing max. number in the last row
        int maxNum = (int) Math.pow(2, rows - 1); 
        int numWidth = String.valueOf(maxNum).length(); // Width of the largest number

        // Loop to print the number pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for centering
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ".repeat(numWidth + 1)); // Add spaces to make look symmetrical
            }

            // Print increasing numbers
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%" + numWidth + "d ", num);
                num *= 2; // Double the number each time
            }

            // Print the decreasing numbers
            num /= 2; // Start decreasing from the last number
            for (int j = 1; j < i; j++) {
                num /= 2;
                System.out.printf("%" + numWidth + "d ", num);
            }

            // Print "@" symbol at the end of each row.
            int totalColumns = rows * (numWidth + 1);
            System.out.printf("%" + (totalColumns - (i * (numWidth + 1)) + numWidth + 1) + "s\n", "@");

            // Add a blank line after each row
            System.out.println();
        }
    }
}
