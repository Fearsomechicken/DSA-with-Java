package dsaLearning.MethodsFile;
import java.util.Scanner;

public class permutationQuestion {
    public static int facto(int num){
        int fact = 1;
        
        for(int i = num; i > 0; i--){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
            return;
        }

        int factN = facto(n);
        int factR = facto(r);
        int factNR = facto(n - r);

        int ncr = factN / factNR;
 
        System.out.println(ncr);
    }
}
