package task4;

import java.util.Scanner;

public class RailRoadsManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distance between trains is 10 km. 1st train has a reserve line in 4km from start.");
        System.out.println("1st train has a chance to avoid crash, if moving faster then 2nd train.");
        System.out.println("Input 1st and 2nd trains speed: ");
        double v1 = scanner.nextDouble(); // first train speed
        double v2 = scanner.nextDouble(); // second train speed

        if (trainsCrashTest(v1,v2)){
            System.out.println("Trains crashes definitely");
        } else {
            System.out.println("Trains have a chance to avoid collision");
        }
    }
// processing trains position
    public static boolean trainsCrashTest(double t1, double t2) {
        if ((t1 + t2)/t1 > 2.5) {
            return true; // trains crashes definitely
        } else {
            return false;
        }

    }


}
