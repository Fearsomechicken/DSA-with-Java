package dsaLearning.MethodsFile;
// all the code is wrong

import java.util.Scanner;

public class nrc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        System.out.println("Enter the value of R:");
        int R = sc.nextInt();
        
        System.out.println("Number of combinations: " + calc(N, R));
    }

    public static int calc(int N, int R) {
        int factN = 1;
        for (int i = 1; i <= N; i++) {
            factN *= i;
        }

        int factR = 1;
        for (int j = 1; j <= R; j++) {
            factR *= j;
        }

        int factNR = 1;
        int W = N - R;
        for (int k = 1; k <= W; k++) {
            factNR *= k;
        }

        int allit = factN / (factR * factNR);

        return allit;
    }
}
