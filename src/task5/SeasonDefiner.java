package task5;

import java.util.Scanner;

public class SeasonDefiner {
    public static void main(String[] args) {

        System.out.println("Okay, so this program can define what season now based on month number input.");
        System.out.println("What type of block you want to use?");
        System.out.println("Please type 1 for if…else statement or 2 for switch…case: ");
        Scanner scanner = new Scanner(System.in);
        int inputOpt = scanner.nextInt();

        if (inputOpt == 1){
            System.out.println("Please input month number(1-12): ");
            int monthNum = scanner.nextInt();
            if (monthNum == 12 | monthNum >= 1 & monthNum <= 2){
                System.out.println("It`s Winter now!");
            } else if (monthNum >= 3 & monthNum <= 5){
                System.out.println("It`s Spring time!");
            } else if (monthNum >= 6 & monthNum <= 8) {
                System.out.println("It`s Summer, vacations time!");
            } else if (monthNum >= 9 & monthNum <= 11) {
                System.out.println("It`s Fall, time of rains and depressions!");
            } else {
                System.out.println("Wrong selection");
            }
        } else if (inputOpt == 2){
            System.out.println("Please input month number(1-12): ");
            int monthNum = scanner.nextInt();
            switch (monthNum) {
                case 12:;
                case 1:;
                case 2:
                    System.out.println("It`s Winter now!");
                    break;
                case 3:;
                case 4:;
                case 5:
                    System.out.println("It`s Spring time!");
                    break;
                case 6:;
                case 7:;
                case 8:
                    System.out.println("It`s Summer, vacations time!");
                    break;
                case 9:;
                case 10:;
                case 11:
                    System.out.println("It`s Fall, time of rains and depressions!");
                    break;
                default:
                    System.out.println("Wrong selection");
            }
        } else {
            System.out.println("Wrong input. Try again smart ass.");
        }
    }
}
