package task7;

import java.util.Scanner;

public class AgeDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your Birth Date: ");
        int bd = scanner.nextInt();

        int age = 2019 - bd;
        System.out.println("Your age is: " + age + " or " + (age-1));

        }

    }


//Попросить пользователя ввести год рождения.
//Определить его возраст учитывая, что сейчас 2019 год.
//Вывести текущий возраст пользователя.