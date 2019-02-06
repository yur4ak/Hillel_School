package task18;

public class Person {
    private int height = 180;
    private String name = "Undefined";

    public void say (String name) {
        System.out.println("Hello, " + name);
    }

    public Person(){}
    public Person(int h, String n){
        height = h;
        name = n;
    }

    public Person(String name){
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}
