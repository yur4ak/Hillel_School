package lesson8;

public class ArrayInitMem {
    public static void main(String[] args) {
        double[] tC = new double[7];
        for (int i = 0; i < tC.length; i++) {
            tC[i] = i+1;
            System.out.println(tC[i]);

        }
    }
}
