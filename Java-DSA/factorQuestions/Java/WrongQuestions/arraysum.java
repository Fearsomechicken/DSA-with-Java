package Java.WrongQuestions;

import java.util.Scanner;

public class arraysum {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of arrayis you want ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int arr[] = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            int sum = findSum(arr);
            System.out.println(sum);
        }
        sc.close();

    }

}
