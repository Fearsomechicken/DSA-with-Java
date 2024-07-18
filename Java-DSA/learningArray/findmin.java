import java.util.Scanner;

public class findmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the arrays : ");
        int N = sc.nextInt();

        // Read the array element
        int arr[] = new int[N];
        System.out.println("Enter the elements of the array :");

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // find the minimun element in the array

        int minElement = arr[0]; // Initialize minElement with the first element of the array
        for (int i = 1; i < N; i++) {
            minElement = Math.min(minElement, arr[i]);
        }

        // Print the minimun Element
        System.out.println("The minimum Element is the array is : " + minElement);

    }
}
