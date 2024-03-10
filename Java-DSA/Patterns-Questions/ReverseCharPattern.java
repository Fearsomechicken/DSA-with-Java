import java.util.Scanner;

public class ReverseCharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            char C = (char) ('A' + N - 1); // A, 65+5-1 , E

            for (int j = 1; j <= i; j++) {
                System.out.print(C);
                C--;
            }
            System.out.println();
        }
    }
}
