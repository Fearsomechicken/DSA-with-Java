/*

1. Read an integer 'n' from the user, representing the number of rows for Pascal's
Triangle


 * 2. For each row 'i' from 0 to 'n-1':
a. Print 'n - i - 1' spaces to format the triangle.
b. Initialise a variable 'value' to 1.
c. For each element in the row 'j' from 0 to 'i':
i. Print 'value' followed by a space.
ii. Update 'value' using the binomial coefficient formula:
value = value * (i - j) / (j + 1)
d. Print a newline character to move to the next row.
 */

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            // spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
