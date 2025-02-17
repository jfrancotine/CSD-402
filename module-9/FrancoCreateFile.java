// Jose Franco
// 02/16/25
// M9 - Programming Assignment 2 - File handling with random numbers

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FrancoCreateFile {
    public static void main(String[] args) {
        String fileName = "data.file";
        Random random = new Random();
        StringBuilder generatedNumbers = new StringBuilder();

        // Writing random numbers to file
        System.out.println("\nGenerating and adding 10 random numbers to the file:");
        try (FileWriter writer = new FileWriter(fileName, true); PrintWriter printWriter = new PrintWriter(writer)) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // Generate a random
                generatedNumbers.append(num).append(" "); // Store number in a string
            }
            System.out.println("Numbers being added: " + generatedNumbers); // Show numbers in console
            printWriter.println(generatedNumbers); // Write numbers to the file
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading and displaying file content
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("\nThe contents of " + fileName + " are:");
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("File has not been found: " + e.getMessage());
        }
        System.out.println();
    }

}
