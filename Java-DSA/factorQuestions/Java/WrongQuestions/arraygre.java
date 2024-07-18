package Java.WrongQuestions;

import java.util.Scanner;

public class arraygre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the element in the array :");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);
    }
}
