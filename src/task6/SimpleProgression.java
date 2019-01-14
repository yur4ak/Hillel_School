package task6;

import java.util.Scanner;

public class SimpleProgression {
    public static void main(String[] args) {
        System.out.println("Input initial, delta(step) and final numbers of progression: ");
        Scanner scanner = new Scanner(System.in);
        double init = scanner.nextDouble();
        double step = scanner.nextDouble();
        double fin = scanner.nextDouble();

        calcProgression(init, step, fin);
    }

    public static void calcProgression(double i, double s, double f) {


        for (double x = 0; x < f; x++) {

            System.out.println("Progression element: " + i);
            i = i + s;
        }
    }
}







       /* if (fin < 2) {
            System.out.println("Progression element: " + init);
        } else {
            System.out.println("Progression element: " + init);

            int x = 0;
            double ext = init;
            do {
                x++;
                ext = ext + step;
                System.out.println("Progression element: " + ext);

            } while (x <= fin - 2);
        }
    }
}
/*    Написать функцию для вывода на экран арифметической прогрессии.
        Пример прогрессии: 10, 12, 14, ..., 34, 36, 38.

        Функция должна принимать в качестве аргумента три параметра:
        начальное значение 1-го элемента, величину смещения и конечное количество элементов прогрессии.
*/



/*
  for (double i = init; i <= fin; i = i+step)
        System.out.println("Progression element: " + calcProgression(init,i,fin));
    }

    public static double calcProgression (double x, double y, double z) {

            for ( int i = x; i <= z; i = i+y) {
            System.out.println("Progression element: " + i}
    }


} */