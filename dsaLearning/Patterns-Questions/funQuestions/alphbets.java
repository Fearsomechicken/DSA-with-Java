
/*
 * Print the following pattern for the given N number of rows.

Pattern for N = 3
A
A B
A B C
Detailed explanation ( Input/output format, Notes, Images )
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines
Constraints:
10 <= N <= 50
 */
package funQuestions;

import java.util.Scanner;

public class alphbets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                c = (char) ('A' + j - 1);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
