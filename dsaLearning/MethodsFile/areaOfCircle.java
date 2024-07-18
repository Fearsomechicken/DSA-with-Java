package dsaLearning.MethodsFile;

/*
 * Write a Java program that calculates and returns the area of a circle given its radius.

Note :
1. You don’t need to print anything. Just implement the given function.
2. Area of a circle = π * r * r, where π (pi) is 3.14159 and r is the radius of the circle.


Solution
 */


public class areaOfCircle {
    public static void main(String[] args){
        double r1 =radiu(2.0);
        double r3= radiu(50);
        System.out.println(r1);
        System.out.println(r3);
        
    }

    public static double radiu(double a){
        double sq=3.14159*a*a;
        return sq;
    }
}
