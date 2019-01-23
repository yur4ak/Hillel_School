package utils;

import java.util.Scanner;

public class Helpers {

    public static int getRandom(int min, int max) {

        return (int) ((max - min + 1) * Math.random()) + min;
    }

    public static int getRandomRnd(int mn, int mx) {
        return  (int) Math.round(((mx - mn) * Math.random())) + mn;
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
        for (double ed : arr) {
            System.out.printf("[%.1f] ", ed);
        }
    }

    public static void showArrayInt(int[] arr) {
        for (int ei : arr) {
            System.out.printf("[%d] ", ei);
        }
    }
}
