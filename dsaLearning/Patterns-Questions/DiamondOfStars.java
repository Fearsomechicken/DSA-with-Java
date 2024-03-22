import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = (N + 1) / 2;
        int B = A - 1;

        // First half of the diamond
        for (int i = 1; i <= A; i++) {

            // Print spaces
            for (int j = 1; j <= A - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second half of the diamond
        for (int i = 1; i <= B; i++) {

            // Print spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * (B - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
