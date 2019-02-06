package lesson11;

import sun.security.krb5.internal.PAData;

public class Main {
    public static void main(String[] args) {

        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();
        Cat myCat4 = new Cat();

//        Parrot par1 = new Parrot();
//        Parrot par2 = new Parrot();
//        Parrot par3 = new Parrot();

        Worm myWorm1 = new Worm();
        Worm myWorm2 = new Worm();
        Worm myWorm3 = new Worm();
        Worm myWorm4 = new Worm();
        Worm myWorm5 = new Worm();

        Animal[] animals = new Animal[]{
                myCat1, myCat2, myCat3, myCat4,
//                par1, par2, par3,
                myWorm1, myWorm2, myWorm3, myWorm4, myWorm5
        };

        for (Animal curAnimnal:animals
             ) {
            curAnimnal.move();
        }


    }
}
