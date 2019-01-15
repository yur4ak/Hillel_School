package task9;

public class FindMaxArr {
    public static void main(String[] args) {
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};
        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};

        findIntArr(aIntNums);
        findDblArr(aDoubleNums);
    }

    public static void findIntArr(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Min: " + min);

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Max: " + max);
    }

    public static void findDblArr(double a[]) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Min: " + min);

        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Max: " + max);
    }
}


//Написать ф-цию нахождения максимального элемента в массиве с целочисленным типом данных double[].
//  Проверить результат передав в качестве аргумента массив чисел типа double.
//
//  Проверку выполнить на данных наборах данных:
//
// 	a) int[] aIntNums = {-10, 20, 34, -11, 100, 20};
//    	Ожидаемый правильный ответ для min: -11
//    	Ожидаемый правильный ответ для max: 100
//
// 	b) int[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
//    	Ожидаемый правильный ответ для min: 0.001
//    	Ожидаемый правильный ответ для max: 43.543