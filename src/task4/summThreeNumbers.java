package task4;

import java.util.Scanner;

public class summThreeNumbers {
    public static void main(String[] args) {
        // input 3 numbers
        System.out.println("Input number of three digits: ");
        int summ3 = summOfThree();

        // print summ of three numbers
        System.out.println("Summ of three numbers: " + summ3);

    }

// calculation function
    public static int summOfThree(){
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int hNum = (inputNum-(inputNum % 100))/100;
        int tNum = ((inputNum % 100) - inputNum % 10)/10;
        int oNum = inputNum % 10;

        return oNum+tNum+hNum;
    }
}
