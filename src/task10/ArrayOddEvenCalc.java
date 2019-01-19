package task10;

import utils.Helpers;

public class ArrayOddEvenCalc {
    public static int count = 100;
    public static void main(String[] args) {

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Helpers.getRandom(-100, 100);
        }

        subsOddEven(arr);
    }

    public static void subsOddEven (int[] arr){
        int ev = 0; int od = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i]%2 == 0) { //check for Evening:)
                ev = ev + arr[i];
            } else
                od = od + arr[i];

        }
        System.out.println("Even summ: " + ev);
        System.out.println("Odd  summ: " + od);
        System.out.println("Final: " + (ev-od));
    }
}

//Написать функцию для поиска разницы сумм всех четных и всех нечетных
//чисел элементов числового массива, т.е от суммы четных чисел вычесть сумму нечетных чисел в массиве.
//Проверить результат выполнения.