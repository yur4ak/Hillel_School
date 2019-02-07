package task22;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(){}

    protected void say() {
        System.out.println("Hello, my name is " + name + ", woof.");
    }
}
