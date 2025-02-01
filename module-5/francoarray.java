// Jose Franco
// 01/31//25
// M5:Assignment - Write methods that returns the location of the largest and smallest elements in the 
// array passed to the method returning a one-dimensional array that contains two location elements.


public class francoarray {

    
    // Locate largest double int
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate largest int
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest double int
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest int
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to print a 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] intArray = {
            {3, 8, 5, 2, 23},
            {12, 2, 9, 21, 47},
            {7, 15, 1, 16, 32}
        };

        double[][] doubleArray = {
            {3.5, 8.1, 5.6, 14.3, 21.4},
            {12.2, 2.4, 9.9, 2.9, 17.2},
            {7.3, 15.5, 1.2, 23.7, 6.2 }
        };

        System.out.println("\nInteger Array:");
        printArray(intArray);

        System.out.println("\nDouble Array:");
        printArray(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("\nThe largest int is located at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("\nThe smallest int is located at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
        System.out.println("\nThe largest double is located at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("\nThe smallest double is located at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]\n");
    }
}
