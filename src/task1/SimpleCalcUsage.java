package task1;

public class SimpleCalcUsage {
    public static void main(String[] args) {

        int addResult = SimpleCalc.add(6, 4);
        int x = SimpleCalc.mult(3,4);

        System.out.println(addResult + " //SimpleCalc result");

        System.out.println(SimpleCalc.mult(5, 5) + " //SimpleCalc result");

        testCalculator(); // call for function


    }

    public static void testCalculator() {
        double actual = SimpleCalc.add(10, 3);
        System.out.println("This is result of division of two numbers: " + actual + " //SimpleCalc result" );

    }
}
