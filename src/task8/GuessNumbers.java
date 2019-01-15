package task8;

import utils.Helpers;

public class GuessNumbers {
    public static void main(String[] args) {
        while (true) {
            int rndNum = Helpers.getRandom(1, 11);
            System.out.println("Guess the number from 1 to 10: ");
            int usrNum = Helpers.getIntKeyboard();
            if (usrNum == rndNum) {
                System.out.println("Congratulations! You are genius!!!");
                break;
            } else {
                System.out.println("Sorry, You are wrong. Try again.");
            }

        }

    }
}

//С помощь конструкции while или do..while создать бесконечный цикл.
//
//Внутри цикла случайным образом программа выбирает целое число от 1 до 10
//и предлагает пользователю его угадать.
//
//Пользователь вводит число, а программа проверяет его и, если пользователь не угадал,
//то говорит больше или меньше. После чего опять просит угадать.
//
//И так, пока, пользователь не угадает выбранное число, а как только угадает, то
//необходимо выйти из цикла и после вывести сообщение об успешно разгаданном числе.
