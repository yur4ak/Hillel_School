package task15;

public class Godzilla {
    private final int STOMACH = 1000; //
    public int food = 0;

    public void setFood(int food) {
        this.food = food;
    }

    /*public void humanEating(int food) {
        if (food >= (STOMACH * .9)) {
            System.out.println("Godzilla is full, leave people alone!");
        } else System.out.println("Feed Godzilla with some humans");
    }*/

    public boolean eat(int volumeEateanFood) {
        food = food + volumeEateanFood;
        if (food >= STOMACH) {
            System.out.println("Godzilla is full, leave people alone!");
            return true;
        } else {
            System.out.println("Feed Godzilla with some humans");
            return false;
        }
    }

    ;
}

//Создать класс Godzilla. У данного класса должно быть свойство - объем желудка.
//Написать для данного класса метод поедания людей.
//В данный метод должен передаваться объем съеденного и соответственно
//уменьшаться место в желудке. Когда Годзила заполнит желудок на 90%,
//то метод должен выводить надпись, что Годзила наелся и больше не может поедать людей.