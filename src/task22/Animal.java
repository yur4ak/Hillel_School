package task22;

public abstract class Animal {

    private boolean predator;
    private boolean domestic;
    private int age = 0;
    private int weight = 0;

    enum color {
        BLACK, WHITE, COLORFUL, BLACKandWHITE
    }

    protected abstract void say();

}
