package FunctionsProgram;

public class Solution {
    public static void printFahrenheitTable(int start, int end, int step) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the specified output in required format.
         * Taking input is handled automatically.
         */
        end = 300;
        step = 20;

        for (start = 0; start <= end; start = start + step) {
            int currentvalue = start;
            int calculate = ( currentvalue -32)*(5/9);
            System.out.println("F= "+ "\f"+ currentvalue +"C "+ calculate)
        }
    }
}
