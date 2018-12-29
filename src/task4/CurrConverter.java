package task4;

import java.util.Scanner;

public class CurrConverter {
    public static void main(String[] args) {
        // input hrivnas
        System.out.println("How much Ukrainian Hrivnas you want to convert: ");
        double hrivnas = inputHrivnas();

        // convert HRN to USD
        double usd = convertingHrnUsd(hrivnas);


        // print result
        System.out.println("You have " + hrivnas + " Ukrainian Hrivnas");
        System.out.println("So, you got : ~" + (int)usd + " $");
    }

// hrivnas input function
    public static double inputHrivnas (){
        Scanner scanner = new Scanner(System.in);
        double hrn = scanner.nextDouble();
        if (hrn < 0){ return 0;}
        else {
            return hrn;
        }
    }
//converting here
    public static double convertingHrnUsd(double h) {
        return h/27.5;


    }

}
