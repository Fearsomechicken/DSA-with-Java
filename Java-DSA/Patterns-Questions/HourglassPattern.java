import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int j = 1;
        for (int i = 1; i <= N; i++) {

            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (j = i; j <= N; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }

        for (int i = N - 1; i >= 1; i--) {

            for (j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (j = i; j <= N; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
