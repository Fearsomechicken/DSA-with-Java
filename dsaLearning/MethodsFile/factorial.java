package dsaLearning.MethodsFile;
import java.util.Scanner;
public class factorial {
    int sum;
    public static int factorials(int n){
        // int sum=1;
        // sum = sum*i;
        // return sum;
        int sum=1;
        for(int i =1; i<=n;i++){
            sum =sum*i;
        }
         return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorials(n));
    }
    
}
