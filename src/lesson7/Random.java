package lesson7;

public class Random {
    public static void main(String[] args) {
        rand();

    }

    public static void rand() {
        for (int i = 0; i <= 10; i++) {
            double x = (Math.random() * 20) - 10;
            System.out.println("Random x = " + (int) x);
        }

    }
}
