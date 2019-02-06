package lesson11;

public class Cat extends Animal {
    public void toCatchMouse(){
        System.out.println("Cat is catching the mouses");
    }

    @Override
    public void move(){
        System.out.println("Cat is moving");
    }

}
