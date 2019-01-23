package task10;

import utils.Helpers;

public class ArrSwapingNum {
    public static int arrLenght = 10;

    public static void main(String[] args) {
        double[] minMaxArr = new double[arrLenght];
        for (int i = 0; i < arrLenght; i++) {
            minMaxArr[i] = Helpers.getRandomRnd(-100, 100);
        }
        int minIndex = 0;
        int maxIndex = 0;
        double minOld = minMaxArr[0];
        double maxOld = minMaxArr[0];
        double minMaxTransfer;

        for (int j = 0; j < arrLenght; j++) {
            System.out.print("[" + minMaxArr[j] + "] ");
            minMaxTransfer = minMaxArr[j];
            if (minMaxTransfer < minOld) { // Min finding
                minOld = minMaxTransfer;
                minIndex = j;
            }
            if (minMaxTransfer > maxOld) { // Max finding
                maxOld = minMaxTransfer;
                maxIndex = j;
            }
        }
        System.out.println();
        System.out.println("Min old: " + minOld);
        System.out.println("Max old: " + maxOld);
        //swap
        double minI = minMaxArr[minIndex];
        double maxI = minMaxArr[maxIndex];
        minMaxArr[maxIndex] = minI;
        minMaxArr[minIndex] = maxI;

       Helpers.showArrayDbl(minMaxArr);
    }
}


// В одномерном числовом массиве типа double[]
// поменять местами минимальный и максимальный элементы.
// Остальные оставить на своих местах.