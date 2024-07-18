import java.util.Scanner;

public class permutationFun {
    public static int facto(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    public static int permutation(int n, int r) {
        // Calculating the factorial i guess
        int nnumber = facto(n);
        int rnumber = facto(n - r);

        return nnumber / rnumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factn = permutation(n, r);
        System.out.println(factn + "this is the answer");
    }
}
