package Java.WrongQuestions;

import java.util.Scanner;

public class Composite3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = 0;
        checkcomposite(N, K);
    }

    public static void checkcomposite(int N, int K) {
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
