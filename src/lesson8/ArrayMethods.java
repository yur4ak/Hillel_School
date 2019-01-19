package lesson8;

public class ArrayMethods {
    public static int bonus = 10;

    public static void main(String[] args) {

        int[] a = {5, 4, 1, 8, 10};

        addBonus(a);

        int x = 1;
        x = meth(x);
        System.out.println(x);

        System.out.println("last: " + a[a.length - 1]);
    }
    public static void addBonus(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] + bonus;
            System.out.print(b[i] + " | ");
        }
    }

    public static int meth( int x) {
        x = x+100;
        return x;

    }
}



        /*public static void showArray(int[] arr) {

        //for (int i = 0; i < arr.length; i++) {

        for (int e : arr) {
            System.out.print(e + " | ");

        }
    }
}*/

