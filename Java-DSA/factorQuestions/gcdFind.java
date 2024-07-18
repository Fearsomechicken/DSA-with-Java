import java.util.Scanner;

public class gcdFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        int gcd = 1; // Initializing gcd to 1
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Updating gcd whenever both numbers are divisible by i
            }
        }
        System.out.println("The GCD is " + gcd);
        return gcd;
    }
}
