package FunctionsProgram;

import java.util.Scanner;

public class Simpleinterestcal {
    public static int calculateSimple(int principal, double rate, int time) {
        int interest = (int) ((principal * rate * time) / 100);
        return interest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        int principal = sc.nextInt();
        double rate = sc.nextDouble();
        int time = sc.nextInt();

        // Calculating simple interest
        int total = calculateSimple(principal, rate, time);

        // Printing the result
        System.out.println(total);
    }
}
