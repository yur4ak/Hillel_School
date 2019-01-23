package lesson9;

import utils.Helpers;

public class SimpleSortArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Helpers.getRandomRnd(-20, 20);
        }
        Helpers.showArrayInt(numbers);


        for (int i = 0; i < numbers.length; i++) {
            int minIndex = getMinIndex(numbers, i);
            swap(numbers, i, minIndex);
        }
        System.out.println();
        Helpers.showArrayInt(numbers);
    }

    public static int getMinIndex(int[] arr, int starIndex) {
        int minIndex = starIndex;
        int min = arr[minIndex];

        for (int i = starIndex; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] arr, int i, int mI) {
        int old = arr[i];
        arr[i] = arr[mI];
        arr[mI] = old;
    }
}
