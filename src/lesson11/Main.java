package lesson11;

import sun.security.krb5.internal.PAData;

public class Main {
    public static void main(String[] args) {

        Animal cotyara = new SmallCat();
        ((SmallCat) cotyara).meow(7);



        Cat myCat1 = new SmallCat();
        Cat myCat2 = new SmallCat();
        Cat myCat3 = new SmallCat();
        Cat myCat4 = new SmallCat();

        Worm myWorm1 = new Worm();
        Worm myWorm2 = new Worm();
        Worm myWorm3 = new Worm();
        Worm myWorm4 = new Worm();
        Worm myWorm5 = new Worm();

        Animal[] animals = new Animal[]{
                myCat1, myCat2, myCat3, myCat4,
                myWorm1, myWorm2, myWorm3, myWorm4, myWorm5
        };

        for (Animal curAnimnal:animals
             ) {
            curAnimnal.move();
        }


    }
}
