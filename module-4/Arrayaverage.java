//Jose Franco
//01/21/2025
//M4 Assignment - Program that will show the average of an array using overloaded methods.

import java.util.Arrays;

public class Arrayaverage {

    // Method for average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    // Method for average of int array
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method for average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method for average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Test program to invoke methods
    public static void main(String[] args) {

        // Welcome message
        String message = "\nOverloaded methods returning the average of an array";
        System.out.println(message);
        System.out.println("-".repeat(message.length()));
       
        // Arrays of different sizes and types
        short[] shortArray = {1, 2, 3};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L, 6000L};
        double[] doubleArray = {10.5, 20.5, 30.5, 40.5, 50.5};

        // Test and display results
        System.out.println("\nValues for the short array: " + Arrays.toString(shortArray));
        System.out.println("The average is: " + average(shortArray) + "\n");

        System.out.println("Values for the int array: " + Arrays.toString(intArray));
        System.out.println("The average is: " + average(intArray) + "\n");

        System.out.println("Values for the long array: " + Arrays.toString(longArray));
        System.out.println("The average is: " + average(longArray) + "\n");

        System.out.println("Values for the double array: " + Arrays.toString(doubleArray));
        System.out.println("The average is: " + average(doubleArray) + "\n");
    }
}

