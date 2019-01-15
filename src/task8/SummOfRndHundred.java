package task8;

import utils.Helpers;

public class SummOfRndHundred {
    public static void main(String[] args) {
        int summOf = 0;
        for (int i = 0; i < 100; i++) {
            int rnd = Helpers.getRandom(-10, 11);
            summOf = summOf + rnd;
            //if (rnd > 9) {
            //}
        }
        System.out.print("Sunn of 100 random numbers: " + summOf);
    }
}

//Просуммировать 100 случайно сгенерированных чисел в диапазоне
//от -10 до +9, т.е   -10 <= random < 10
//вывести полученную сумму на экран.