package task9;

import utils.Helpers;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] a = {5, 7, 3, 11, 0, 8, -100};
        findArrNum(a);
    }

    public static void findArrNum(int a[]){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);


    }
}

//Написать ф-цию нахождения минимального элемента в массиве с целочисленным типом данных int[].
//Проверить результат передав в качестве аргумента значение массив чисел типа int.