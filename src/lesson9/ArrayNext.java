package lesson9;

import utils.Helpers;

public class ArrayNext {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillRndArray(numbers);
        Helpers.showArrayInt(numbers);

    }

    public static void fillRndArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Helpers.getRandomRnd(0, 100);

        }

    }
}
