package task22;

import task22.animalworld.Labrador;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Tuzik");
        Animal dog2 = new Dog("Sharik");
        Animal cat1 = new Cat("Lapka");
        Animal fish1 = new Fish();
        Animal lio1 = new Lion();
        Animal wolf1 = new Wolf();
        Dog lab1 = new Labrador("Laba");

        dog1.say();
        dog2.say();
        cat1.say();
        fish1.say();
        lio1.say();
        wolf1.say();
        lab1.say();
    }
}
