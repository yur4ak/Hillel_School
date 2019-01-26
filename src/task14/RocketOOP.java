package task14;

public class RocketOOP {
    private int height;
    private int diameter;
    private String color = "White";
    private int oxygen;
    private int methane;

    private static String falcon9 = "Falcon 9";
    private static String fHeavy = "Falcon Heavy";
    private static String starship = "Starship";


    private boolean mainThrusterState;

    public void engineStart() {mainThrusterState = !mainThrusterState;}
    public void increaseThrusterPower() {oxygen++; methane++;}
    public void decreaseThrusterPower() {oxygen--; methane--;}

    public void rocketSubOrbitalType() {
        String rocketType = falcon9;
        height = 50;
        diameter = 4;
        engineStart();
        //?mainThrusterState = true;
        increaseThrusterPower();
        System.out.print("Rocket height = " + height);
    }

    public static void main(String[] args) {
        RocketOOP falcon9 = new RocketOOP();
        falcon9.rocketSubOrbitalType();
    }
}

//Создать класс.
//Создать определить поля с именами полей на ваш выбор:
//несколько статических полей любого типа;
//4 не статических поля типа любого типа;
//определить для полей различный уровень доступа;
//private, public или [default-package];
//создайте несколько методов для данного класса и примените к методам данного класса различные уровни доступа.
//Внимание, если вы использует static поля в каком-либо методе класса, то и сам метод должен быть помечен как static.
//
//С помощью оператора new создайте несколько объектов данного класса.
//Например:
//class Display { // here your definition of fields}
//	Display display1 = new Dispaly(); // create a new object of type Display
//	Display display2 = new Dispaly(); // create a new object of type Display
//	Display display3 = new Dispaly(); // create a new object of type Display