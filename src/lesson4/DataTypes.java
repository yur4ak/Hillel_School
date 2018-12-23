package lesson4;

public class DataTypes {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 124;

        System.out.println("Symbol: " + c1);
        System.out.println("Pseudo symbol: " + c2);

        boolean b = false;
        boolean bb = true;

        int x = 16%3; //remainder of the division
        System.out.println("Remainder of the division: " + x);

        // ---- functions call ----
        castData();
        compare2Numbers(7, 5);

        if(isNumbersEven(11) == true) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }

    public static void showAllDataTypes (){

        byte byt = 67; // -128 ... 127
        short sht = 9999; // -32768 ... 32768
        int integer = 2000000000; // -2147483648 ... -2147483647
        long lng = 4666666666666L;

        float flt = 234.3344F;
        double dbl = 24384762319875.3253245;


    }

    public static void castData (){

        byte b = 10;
        int x = b; // x is b

        long d = 897523948534L;
        int i = (int) d;


        System.out.println("Print b through x: " + x);
        System.out.println(i);

    }

    public static void compare2Numbers(int x, int y) {

        boolean result = x < y;

        if (result == true) {
            System.out.println("x<=y");

        }
        else {
            System.out.println("x>=y");
        }





        System.out.println("Result of two vars: " + result);
    }

    public static boolean isNumbersEven(int num) {

        int result = num & 1;
        if (result == 0) {
            return true;
        }
        else {
            return false;
        }

    }

}
