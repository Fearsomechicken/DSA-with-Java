package Java.WrongQuestions;

import java.util.Scanner;

public class altpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int temp;
        for (int j = 0; j < arr.length - 1; j += 2) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;

        }
        System.out.println(" Swapped values are");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
