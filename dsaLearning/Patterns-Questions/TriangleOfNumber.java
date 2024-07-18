package Patterns2;

// Importing Scanner class from java.util package for user input
import java.util.Scanner;

// Class declaration for TriangleOfNumber
public class TriangleOfNumber {
    // Main method where the execution starts
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the number of rows for the pattern
        System.out.print("Enter the number of rows: ");

        // Reading the user input for the number of rows
        int N = sc.nextInt();

        // Loop for each row in the pattern
        for (int i = 1; i <= N; i++) {
            // Loop for printing forward spaces in each row
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }

            // Loop for printing numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + i - 1);
            }

            // Loop for printing numbers in descending order (excluding the last number)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + i - 1);
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        // Closing the Scanner to prevent resource leaks
        sc.close();
    }
}