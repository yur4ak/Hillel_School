package lesson15;

public class Main {
    public static void main(String[] args) {
        ClassB cB1 = new ClassB(1, 314);
        System.out.println(cB1.getY());


        String cV = "1.002.345";
        String s1 = new String("ABC");
        String s3;
        System.out.println(s1 + "  " + s1.length());
        System.out.println(addPrefix(s1));
        System.out.println(addPrefix(s1) + addPostfix(s1, cV));
    }

    public static String addPrefix(String temp){
        return "001_"+ temp;
    }

    public static String addPostfix(String src, String currVersion){
        return src+" ver." + currVersion;
    }
}
