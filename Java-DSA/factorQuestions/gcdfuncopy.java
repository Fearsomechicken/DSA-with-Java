import java.util.Scanner;

public class gcdfuncopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCDcheck(a, b);

    }

    public static int GCDcheck(int a, int b) {
        int r = 0;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(r);
        return r;
    }
}
