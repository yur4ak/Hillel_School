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

    }

    public static void showAllDataTypes (){

        byte byt = 67; // -128 ... 127
        short sht = 9999; // -32768 ... 32768
        int integer = 2000000000; // -2147483648 ... -2147483647
        long lng = 4666666666666L;

        float flt = 234.3344F;
        double dbl = 24384762319875.3253245;


    }

}
