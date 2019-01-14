package lesson7;

import utils.Helpers;

public class AdvancedRndArray {
    public static void main(String[] args) {

        rndToArr();

    }

    public static void rndToArr() {
        System.out.println("Input range please: ");
        int len = Helpers.getIntKeyboard();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = getRandom(-20, 20);

        }
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + "; ");
            if (x%10 < 0) {
                System.out.println();

            }

        }

    }

    public static int getRandom(int min, int max) {

        return (int) ((max - min) * Math.random()) + min;
    }
}
