package task6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Input any number to get factorial: ");

        Scanner scanner = new Scanner(System.in);
        double fact = scanner.nextDouble();
        System.out.println("0! = 1.0");

        double f = 1;

        for (int x = 1; x <= fact; x++){
            f = f*x;

            System.out.println(x + "! = " + f);
        }
    }
}

//Написать функцию нахождения факториала числа используя любой тип цикла на выбор: for, while, do..while.