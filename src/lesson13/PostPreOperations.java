package lesson13;

public class PostPreOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = x++ + y++;

        System.out.println(z);
    }
}
