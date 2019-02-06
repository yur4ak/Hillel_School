package lesson11;

public class Car {
    private int speed;
    private int fuelLevel;
    private boolean state;
    private Driver driver;

    public void star(){
        state = true;
        speed = 0;
    }

    public void accelerate (){
        speed += 10;
    }

    public void breaking () {
        speed -= 10;
    }

    public void stop(){
        state = false;
        speed = 0;
    }

    public void parking(){
        speed = 0;
    }

    public void turnLeft(){
        System.out.println("Turning left");
    }

    public void turnRight(){
        System.out.println("Turning right");
    }

    public void fuelExpense(){
        fuelLevel--;
    }
}
