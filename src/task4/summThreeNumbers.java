package task4;

import java.util.Scanner;

public class summThreeNumbers {
    public static void main(String[] args) {
        // input 3 numbers
        System.out.println("Input three numbers: ");
        int summ3 = summOfThree();

        // print 3 numbers
        System.out.println("Summ of three numbers: " + summ3);

    }

// calculation function
    public static int summOfThree(){
        Scanner scanner = new Scanner(System.in);
        int inputNumOne = scanner.nextInt();
        int inputNumTwo = scanner.nextInt();
        int inputNumThree = scanner.nextInt();
        return inputNumOne+inputNumTwo+inputNumThree;
    }
}
