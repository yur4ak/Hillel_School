package task18;

public class MainPerson {
    public static void main(String[] args) {
        Person jhuan = new Person(180, "Jhuan Pedrovich");

        jhuan.say("my height is ");
        System.out.println(jhuan.getHeight() + " and my name is " + jhuan.getName());
        System.out.println();


        Student freshman = new Student(184, "Dan", 3);
        freshman.tell();
    }
}
