import java.util.Scanner;

public class makeK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        
        for(int i =N; i>=1;i--){
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        // printing lower half of K
        for (int i = 2; i<= N; i++) {
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
