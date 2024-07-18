package Java.WrongQuestions;

public class findgreaternum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 445, 5434 };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Greatest number is " + max);
    }
}
