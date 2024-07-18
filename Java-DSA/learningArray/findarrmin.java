import java.util.Scanner;

public class findarrmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The minimun element in the array : " + fintarr(0));
    }

    public static int fintarr(int minElement) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.print("Enter the Number of elements");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        minElement = arr[0];
        for (int i = 1; i < N; i++) {
            minElement = Math.min(minElement, arr[i]);
        }

        return minElement;
    }
}