package lesson10;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = "ab";

        System.out.println(s3 == s4);
        System.out.print(s3.getBytes() + " " + s4.getBytes());
        System.out.println(" ");



    }
}
