package task22;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    protected void say() {
        System.out.println("Hello, my name is " + name + ", meow.");
    }

}
