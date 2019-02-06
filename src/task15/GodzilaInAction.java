package task15;

import utils.Helpers;

public class GodzilaInAction {
    public static void main(String[] args) {

        Godzilla littleGodzilka = new Godzilla();

        System.out.println("How many people you don't care: ");
        int feedGodzila = Helpers.getIntKeyboard();

        while (!littleGodzilka.eat(feedGodzila)) {
            System.out.println("How many people you don't care: ");
            feedGodzila = Helpers.getIntKeyboard();
            if (littleGodzilka.food < 1000)
            littleGodzilka.eat(feedGodzila);
            else continue;
        } // double: "Godzilla is full, leave people alone!", message ?????
    }
}

//littleGodzilka.humanEating(100);
//littleGodzilka.humanEating(1000);
//        littleGodzilka.setFood(1000);
//        System.out.println(littleGodzilka);