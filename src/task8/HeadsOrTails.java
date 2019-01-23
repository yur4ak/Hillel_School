package task8;

import utils.Helpers;

public class HeadsOrTails {
    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 200; i++) {
            int ht = Helpers.getRandomRnd(0, 1);
            // test - System.out.print(ht + " ");
            if (ht < 1) {
                heads++;
            }
            if (ht > 0) {
                tails++;
            }
        }
        //final result
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);

    }
}

//Смоделировать игру “Орел и Решка”.
//Бросить монетку 2000 раз и посчитать сколько раз выпал “орел”, а сколько раз “решка”.
//Подсказка: использовать генератор случайных чисел с
// генерацией чисел в диапазоне от 0 до 1. Если генератор выдает 1 - орёл, а 0 - решка.