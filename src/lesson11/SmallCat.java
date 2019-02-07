package lesson11;

public class SmallCat extends Cat {
    @Override
    public void move(){
        System.out.println("Small cat is moving");
    }
    @Override
    public void meow (int num){
        System.out.println("Small cat meows " + num + " times");
    }

}
