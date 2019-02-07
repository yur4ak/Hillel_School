package task22.animalworld;

import task22.Dog;

public class Labrador extends Dog {

    String name;

    public Labrador(String name) {
        this.name = name;
    }
//    String name;
//    @Override
//    protected void say(String name) {
//        super.say();
//    }

    void loudSay(String name){
       // say(name); // как отправить в родительский класс кличку животного ???
        say();

    }
}
