package utils;

import java.util.Scanner;

public class Helpers {

    public static int getRandom(int min, int max) {
        return (int) ((max - min) * Math.random()) + min;
    }

    public static int getIntKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double getDblKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void showArrayDbl(double[] arr) {
        for (double e : arr) {
            System.out.print(e + " ");


        }
    }

    public static void showArrayInt(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");


        }
    }
}
