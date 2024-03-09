package Patterns2;

import java.util.Scanner;

public class TriangleOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            // for forward Spaces
            // for (int j = 1; j <= N - i; j++)
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            // for Numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + i - 1);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + i - 1);
            }
            System.out.println();

        }
    }
}
