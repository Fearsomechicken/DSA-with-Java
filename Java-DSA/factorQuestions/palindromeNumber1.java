import java.util.Scanner;

public class palindromeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int rev = 0;
        int digit = 0;
        int leg = String.valueOf(N).length();
        // System.out.println("Enter the number : " + leg);

        for (int i = 0; i < leg; i++) {
            digit = N % 10;
            N = N / 10;
            rev = rev * 10 + digit;
        }
        // System.out.println(rev);
        if (rev == temp) {
            System.out.println("its a palindorme");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
