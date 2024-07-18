import java.util.Scanner;

public class findunq { // Class names should start with an uppercase letter
    public static int findUnique(int[] arr) {
        // Your code goes here
        for (int j = 0; j < arr.length; j++) { // Use j instead of k
            int count = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[j] == arr[k]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[j];
            }
        }
        return -1; // Add a return statement for cases when no unique element is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int l = sc.nextInt();
            int arr[] = new int[l];
            for (int i = 0; i < l; i++) {
                arr[i] = sc.nextInt();
            }

            int unique = findUnique(arr); // Capture the returned value
            System.out.println(unique); // Print the unique value

            n--; // Decrement n to avoid an infinite loop
        }

        sc.close(); // Close the scanner
    }
}
