package lesson4;

public class BitWise {
    public static void main(String[] args) {
        int x = 345;
        int r = x & 1; // find even or odd number, logic *
        System.out.println("If 1 then its odd number: " + r);

        int y = 0;
        int r1 = y | 0;  // logic OR
        System.out.println(r1);

        int z = 2; // 0010
        int r2 = 0; // 0000

        int r3 = 10 >> 1; // moved
        System.out.println(r3);

        int r4 = 8 ^ 2; // logic XOR
        System.out.println(r4);

    }
}
