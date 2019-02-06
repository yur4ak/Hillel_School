package lesson11;

public class Parrot extends Animal {
    enum ParrotColor {
        RED, GREEN, PINK, BLUE, WHITE, YELLOW, RAINBOW
    }

    private ParrotColor color;

    public Parrot(ParrotColor color) {
        this.color = color;
    }


    @Override
    public void move() {
        System.out.println("Parrot is flying");
    }
}
