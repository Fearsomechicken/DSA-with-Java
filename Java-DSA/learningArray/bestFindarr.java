import java.util.Scanner;

public class bestFindarr {
    public static int minimun_element(int arr[]) {
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            minElement = Math.min(minElement, arr[i]);
        }
        return minElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int minElement = minimun_element(arr);

        System.out.print("Min Number is " + minElement);
    }
}
