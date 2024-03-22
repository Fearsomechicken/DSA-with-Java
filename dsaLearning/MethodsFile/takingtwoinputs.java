package dsaLearning.MethodsFile;
import java.util.Scanner;
public class takingtwoinputs {


    public static int additionofnumber(int A, int B){
        int Sum = A+B;
        return Sum;
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = additionofnumber(A, B);

        System.out.println(result);
        
    }
}
