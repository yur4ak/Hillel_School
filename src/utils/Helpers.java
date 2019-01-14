package utils;

import java.util.Scanner;

public class Helpers {

    public static int getRandom(int min, int max) {
        return (int) ((max - min) * Math.random()) + min;
    }

    public static int getIntKeyboard(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double getDblKeyboard(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
