// compare numbers, and if else if, switch
package lesson5;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        boolean r = compare(20, 20);

        System.out.println("Compare two numbers: " + r);

        System.out.println("Should be TRUE if 0: " + compareToZero(0));

        compNum(3, 3);

        //handleSelection(11);
        System.out.println("Input month number: ");
        int month = numberInput();
        System.out.println("You've input month number: " + month);


    }
    //input from user
    public static int numberInput(){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }


    // process user selections
    public static void handleSelection(int n){
        if (n ==1){
            System.out.println("Transfer a call to Monitors dept.");
        } else if (n == 2) {
            System.out.println("Transfer a call to HDDs dept.");
        } else if (n == 3){
            System.out.println("Transfer a call to Mouses dept.");
        } else if(n == 4){
            System.out.println("Transfer a call to Keyboards dept.");
        } else {
            System.out.println("Wrong selection");
        }

    }

    public static void handleSelectionAdvanced(int n){
        switch (n) {
            case 1:
                System.out.println("Transfer a call to Monitors dept.");
                break;
            case 2:
                System.out.println("Transfer a call to HDDs dept.");
                break;
            case 3:
                System.out.println("Transfer a call to Mouses dept.");
                break;
            default:
                System.out.println("Wrong selection");
        }

    }




    public static void compNum(int x, int y) {
        if (x > y) {
            System.out.println("TRUE");
                                        } else {
                                                 if (x == y) {
                                                     System.out.println("x == y");
                                                 } else {
                                                     System.out.println("x < y");
                                                 }
                                        }
    }

    public static boolean compareToZero(int x){
        return x == 0;
    }

    public static boolean compare(int x, int y) {
       // boolean result = (x <= y) && (x>10); //AND
        boolean result = x < y;
        return !result; // return inverted result

    }
}
