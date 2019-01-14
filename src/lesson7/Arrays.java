package lesson7;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1; // first element of array
        arr[1] = 5; // 2nd element of array

       /* for (int i = 0; i <= 9; i++) {
            System.out.println("arr = " + arr[i]);
        }

        int[] a = {32, 2, 65, 9, 0, 1}; // same as new int[6]
        System.out.println(a[5]); */

        ar();
    }

    public static void ar() {
        /*int[] a = new int[]{2, 5, 66, -7, 0, 9}; // same as int[] a = {};

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("array a = " + a[i]);
            *//*sum += a[i];
            System.out.println("Array sum = " + sum);
            System.out.println("+");*//*
        }
        for (int element : a) {
            System.out.print(element + " ");
*/


        int[] arrRnd = new int[50]; //simple rnd -20…0

        for (int i = 0; i < arrRnd.length; i++) {

            int x = ((int)-(Math.random() * 20));
            arrRnd[i] = x;
            System.out.println("Random x = " + arrRnd[i]);
        }


    }
}
