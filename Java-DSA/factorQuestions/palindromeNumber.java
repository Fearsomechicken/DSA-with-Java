import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        if (isPalindrome(N)) {
            System.out.println(N + " is a palindrome.");
        } else {
            System.out.println(N + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int N) {
        int rev = 0;
        int digit;
        int temp = N;

        while (temp != 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return rev == N;
    }
}
