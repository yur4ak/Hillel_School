package task10;

public class ArraySwappingChar {
    public static void main(String[] args) {
        char[] chArr = {'r', 'o', 'l', 'o', 'c'};
        System.out.println("chArr before:");
        for (int i = 0; i < chArr.length; i++) {
            System.out.print(" " + chArr[i]);
        }
        System.out.println();
        swapArrays(chArr);
        for (int j = 0; j < chArr.length; j++) {
            System.out.print(" " + chArr[j]);
        }

    }

    public static char[] swapArrays(char[] x) {
        char ft = 0, ls = 0;
        ft = x[0];
        ls = x[x.length - 1];
        x[0] = ls;
        x[x.length - 1] = ft;
        return x;
    }
}

//Написать функцию, которая меняет местами 1-й элемент массива с последним.
//Пример массива для тестирования работы ф-ции:
//char[]  chArr =  {‘r’, ‘o’, l‘’, ‘o’, ‘c’};