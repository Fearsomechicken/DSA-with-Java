import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        int start, end, i, j;
        System.out.println("Enter The range for prime Number");
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();

        for (i = start; i <= end; i++) {
            int count = 0;

            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
