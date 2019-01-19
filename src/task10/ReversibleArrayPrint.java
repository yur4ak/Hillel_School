package task10;

import utils.Helpers;

public class ReversibleArrayPrint {
    public static void main(String[] args) {
        int[] arrtest = {10, -3, 0, 99, 100, 2, 7};
        int i;
        for (i = arrtest.length-1; i >= 0; --i) {
            System.out.print(arrtest[i] + " | ");
        }
    }
}

//Вывести элементы массива в обратном порядке используя любую конструкцию цикла. Тип массива на ваш выбор.