package lesson11;

public abstract class Cat extends Animal {
    public void toCatchMouse(){
        System.out.println("Cat is catching the mouses");
    }

//    @Override
//    public void move(){
//        System.out.println("Cat is moving");
//    }
//
//    @Override
//    public void sleep() { System.out.println("Cat is sleeping");}

    public abstract void meow(int num);

}
