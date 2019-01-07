package task4;

import java.util.Scanner;
import java.lang.*;

public class SolvingQuadraticFormula {
    public static void main(String[] args) {
        //explanation for user
        System.out.println("The Quadratic Formula has the basic form: ax² + bx + c = 0");
        System.out.println("Where x represents an unknown, and a, b, and c represents known numbers.");
        System.out.println("Please input known numbers a,b,c: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) { // check for a = 0
            System.out.println("This equation has no solutions because a = 0. Try again where a not 0");
        } else {

            //logic for b = 0 and c = 0
            if (a != 0 & b == 0 & c == 0) {
                System.out.println("This equation has only one solution: X = 0");
            } else if (a != 0 & b == 0 & c != 0) { // logic for only b = 0
                double rootXone = Math.sqrt(-(c / a));
                if (Double.isNaN(rootXone)) { // check for negative sqrt root
                    System.out.println("Sorry, but square root has a negative value");
                } else {
                    System.out.println("This equation has two answers: ");
                    System.out.println("X1 = " + Math.sqrt(-(c / a)));
                    System.out.println("X2 = " + (-(Math.sqrt(-(c / a)))));
                }
            } else if (a != 0 & b != 0 & c == 0) { // ax² + bx = 0
                System.out.println("In this situation:");
                System.out.println("X1 = 0");
                System.out.println("X2 = " + (-(b / a)));
            } else {

                // discriminant applying
                double discr = discriminantCalc(a, b, c);
                double result = oneRoot(a, b, c);

                //logic for result printing
                if (discr == -1) { // for this conditions there is NO SOLUTION
                    System.out.println("This equation has no solutions because Discriminant less then 0");
                } else if (discr == 0) { // if quadratic equation has one square root
                    System.out.println("Quadratic equation has only one square root because Discriminant is 0: X = " + result);


                } else if (discr > 0) {
                    System.out.println("Quadratic equation has two square roots: ");
                    System.out.println("X1 = " + (-b + Math.sqrt(discr)) / (2 * a));
                    System.out.println("X2 = " + (-b - Math.sqrt(discr)) / (2 * a));

                }
            }
        }
    }
    // processing discriminant
    public static double discriminantCalc(double a, double b, double c) {
        double D = (b*b) - (4*a*c);
        if (D < 0) {
            return -1;
        } else if (D == 0) {
            return 0; // this marker return if Discriminant = 0
        } else {
            return D; // this marker return if Discriminant > 0
        }
    }
    //finding square root
    public static double oneRoot(double a, double b, double c) {
            return (-b/(2*a));
    }

}
