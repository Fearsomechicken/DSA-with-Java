import java.util.Scanner;

public class fiboc {
    public static boolean checkMember(int n) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (n < 0) {
            return false;
        }
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (checkMember(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();

    }
}
