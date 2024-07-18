import java.util.Scanner;

public class gcdfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("GCD is " + b);
    }
}
