package lesson8;

public class StringsDemo {
    public static void main(String[] args) {
        String s1 = "The world is not enough";
        String s2 = new String("Are you sure?");

        int l = s1.length();


        System.out.println("s1 = " + l);

        if (s1 == s2){
            System.out.println("Stirngs are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
