package task10;

import utils.Helpers;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] srcArr = {7, 8, 9, -9, 0, 2};
        int[] newArr = copyArr(srcArr);

        Helpers.showArrayInt(newArr);
    }

    public static int[] copyArr(int[] src) {

        int[] cArr = src;
        return cArr;
    }
}

//Реализовать метод, который создает копию элементов массива.
//	Например ваш метод:
//	int[] copyArray(int[] src);
//
//Должен  создать и вернуть новый массив данных типа int[] содержащий такие же значения элементов
//как и у входного src массива.