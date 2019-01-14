package lesson7;

public class MathCalc {
    public static void main(String[] args) {

        //square root of number
        double x = Math.sqrt(256);
        System.out.println("sqr = " + x);

        //random number
        double y = Math.random();
        System.out.println("rnd = " + y);

        //min or max
        double z = Math.min(256, 10);
        System.out.println("min = " + z);

        //round
        double j = Math.round(0.5444);
        System.out.println("round = " + j);

        // floor or ceil
        double k = Math.floor(256.89);
        System.out.println("floor = " + k);

        // power of
        double a = Math.pow(2.899987, 5);
        System.out.println("pow = " + a);

        // absolute number
        double b = Math.abs(-256.554);
        System.out.println("abs = " + b);

    }

}
