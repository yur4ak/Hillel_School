package task5;

import java.util.Scanner;

public class DividingByFour {
    public static void main(String[] args) {

        System.out.println("Please input any number: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        System.out.println("Your number is divided by 4, so: " + bitDivByFour(num));

    }

    public static long bitDivByFour(double number){
        long simplNum = (long)number;
        return simplNum >> 2; // bit moving, divide by 4, << - multiply
    }
}
