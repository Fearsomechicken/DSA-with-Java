import java.util.Scanner;

public class compositefun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 0;
        print_composite(N, K);
    }

    public static void print_composite(int N, int K) {
        for (int i = 1; i <= N; i++) {
            K = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    K++;
                }
            }

            if (K > 2) {
                System.out.println(i);
            }

        }
    }
}
