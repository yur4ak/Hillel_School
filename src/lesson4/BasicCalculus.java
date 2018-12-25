package lesson4; // home work com.hillel.task2:

public class BasicCalculus {
    public static void main(String[] args) {
        // first method call
        double calcres1 = methodCalc1(2, 3, 807.6);
        System.out.println("Method #1 is: " + (int)calcres1);

        // second method call
        double calcres2 = methodCalc2(2 , 1);
        System.out.println("Method #2 is: " + calcres2);

        // third method call
        double calcres3 = methodCalc3(2 , 1, 11);
        System.out.println("Method #3 is: " + calcres3);

        // fourth method call
        double calcres4 = methodCalc4(5 , 3.14, 90);
        System.out.println("Method #4 is: " + calcres4);

    }  // end of Main

    // 1st Method
    public static double methodCalc1(double a, double b, double c) {
        double rmc1 = (a + b) * ( c / 2 );
        return rmc1;
    }
    // 2nd Method
    public static double methodCalc2(double a, double b) {
        double rmc2 = ((a*a) + (b*b)) % 2;
        return rmc2;
    }
    // 3rd Method
    public static double methodCalc3(double a, double b, double c) {
        double rmc3 = ( a + b ) / (((12 * c) % 4) + b);
        return rmc3;
    }
    // 4th Method
    public static double methodCalc4(double a, double b, double c) {
        double rmc4 = (a - (b * c)) / (a + b) % c;
        return rmc4;
    }

}
