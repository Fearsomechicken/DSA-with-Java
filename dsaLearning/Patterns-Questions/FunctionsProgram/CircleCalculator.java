package FunctionsProgram;

public class CircleCalculator {

    // Function to print Fahrenheit to Celsius conversion table
    public static void printFahrenheitTable(double start, double end, double step) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the specified output in required format.
         * Taking input is handled automatically.
         */

        for (double fahrenheit = start; fahrenheit <= end; fahrenheit += step) {
            double celsius = (double) ((5.0 / 9.0) * (fahrenheit - 32));
            System.out.println("F = " + fahrenheit + ", C = " + celsius);
        }
    }

    public static void main(String[] args) {
        // Example usage of the printFahrenheitTable function
        printFahrenheitTable(0, 300, 20);
    }
}
