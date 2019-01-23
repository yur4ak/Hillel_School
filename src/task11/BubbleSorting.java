package task11;

import utils.Helpers;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = new int[13];
        System.out.println("Unsorted array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Helpers.getRandomRnd(-100, 100);
        }
        Helpers.showArrayInt(arr);

        for (int i = 0; i < arr.length; i++) {
            bubbleArraySwap(arr, i);
        }
        //test
        System.out.println();
        System.out.println("Sorted bubble array:");
        Helpers.showArrayInt(arr);
    }

    public static void bubbleArraySwap(int[] arr, int i) {
        int x;
        for (int j = 1; j < (arr.length - i); j++) {
            if (arr[j - 1] > arr[j]) {
                x = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = x;
            }
        }
    }
}

//Самостоятельно разобраться с алгоритмом пузырьковой сортировки;
