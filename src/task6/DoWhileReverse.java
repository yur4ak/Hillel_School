package task6;

public class DoWhileReverse {
    public static void main(String[] args) {

        int x = 10;
        System.out.println("Reverse count: " + x);
        do {
            x--;
            System.out.println("Reverse count: " + x);
        } while (x > 0);
    }
}
