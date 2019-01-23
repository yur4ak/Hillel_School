package task10;

import utils.Helpers;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] srcArr = {7, 8, 9, -9, 0, 2};
        int[] newArr = {1, 1, 1, 1, 1, 1};
        copyArr(srcArr, newArr);

        System.out.println("Source array: ");
        Helpers.showArrayInt(srcArr);

        newArr[newArr.length-1] = 111111;
        System.out.println();
        System.out.println("Copied array: ");
        Helpers.showArrayInt(newArr);

        System.out.println();
        System.out.println("Source array: ");
        Helpers.showArrayInt(srcArr);
    }

    public static void copyArr(int[] src, int[] nArr) {

        for (int i = 0; i < src.length; i++) {
            int x = src[i];
            nArr[i] = x;
        }
    }
}

//Реализовать метод, который создает копию элементов массива.
//	Например ваш метод:
//	int[] copyArray(int[] src);
//
//Должен  создать и вернуть новый массив данных типа int[] содержащий такие же значения элементов
//как и у входного src массива.