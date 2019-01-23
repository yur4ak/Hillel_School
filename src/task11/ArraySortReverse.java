package task11;

import utils.Helpers;

public class ArraySortReverse {
    public static void main(String[] args) {
        int[] arr = new int[13];
        System.out.println("Unsorted array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Helpers.getRandomRnd(-100, 100);
        }
        Helpers.showArrayInt(arr);

        int maxI = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxI = getMax(arr, i);
            swap(maxI, i, arr);
        }


        //test
        System.out.println();
        System.out.println("Sorted selection array:");
        Helpers.showArrayInt(arr);
    }

    public static int getMax(int[] arr, int starIndex) {
        int maxIndex = starIndex;
        int min = arr[maxIndex];

        for (int i = starIndex; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void swap(int mI, int i, int[] aNew) {
        int old = aNew[i];
        aNew[i] = aNew[mI];
        aNew[mI] = old;
    }
}

//реализовать алгоритм сортировки методом “выбора” по убыванию