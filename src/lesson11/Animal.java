package lesson11;

public abstract class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract void move();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
