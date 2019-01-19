package task10;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int[] ar1 = {3, 2, 90, 0};
        int[] ar2 = {3, 2, 90, 0};

        if (equalArrays(ar1, ar2))
            System.out.println("Arrays is equal");
        else System.out.println("Arrays is inequality");

    }

    public static boolean equalArrays(int[] a1, int[] a2) {
        boolean x = true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                x = false;
            } else
                x = true;
        }
        return x;


    }
}

//Написать метод сравнения двух массивов типа int[].
//Например, сигнатура данного метода может иметь такой вид:
//boolean equalArrays(int a1, int a2);