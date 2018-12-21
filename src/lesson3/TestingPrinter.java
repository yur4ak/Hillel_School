package lesson3;

public class TestingPrinter {
    public static void main(String[] args) {

        System.out.println("be-me");
        testPrinter();
    }

    public static void testPrinter() {
        LaserPrinter.turnOn();
        LaserPrinter.setPageFormat("A5");
        LaserPrinter.testPage();

        LaserPrinter.turnOff();
    }
}
