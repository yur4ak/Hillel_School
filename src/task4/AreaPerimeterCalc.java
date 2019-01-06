package task4;

import java.util.Scanner;

public class AreaPerimeterCalc {
    public static void main(String[] args) {
        //story
        System.out.println("The farmer wants to buy a rectangular piece of land and build\na fence around it and lay a lawn.");

        //input width and height of the site
        System.out.println("For fence and lawn we need to know perimeter and area of the site.\nInput Height and Width:");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();

        //send dimensions to functions to calc
        double area = areaCalc(height, width);
        double perimeter = perimeterCalc(height, width);

        // print results
        System.out.println("The farmer will need " + perimeter + " units of fence for his site,");
        System.out.println("and " + area + " square units of lawn.");

    }

    //calc area
    public static double perimeterCalc(double h, double w){
        return (h + w) * 2;
    }
    //calc perimeter
    public static double areaCalc(double h1, double w1){
        return w1*h1;
    }
}
