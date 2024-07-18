package FunctionsProgram;

public class SquareCalculator {

    public static double AreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.54;
        double area = AreaOfCircle(radius);

        System.out.println("The radius of " + radius + " Is " + AreaOfCircle(radius));
    }
}
