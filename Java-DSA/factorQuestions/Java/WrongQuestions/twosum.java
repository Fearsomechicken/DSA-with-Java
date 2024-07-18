package Java.WrongQuestions;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give target ");
        int T = sc.nextInt();
        System.out.println("array no. ");
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] + arr[k] == T) {
                    System.out.println("your solution is " + j + " " + k);
                }
            }
        }
    }
}
