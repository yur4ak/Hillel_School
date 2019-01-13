package task7;

public class ForHundred {
    public static void main(String[] args) {
        int i = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.println("Current step = " + x);
            i = i+x;
            System.out.println("Res sum: " + i);
        }
        //System.out.println("Res sum: " + i);

    }
}

//Посчитать сумму чисел от 1..100 с помощью цикла for.
//Вывести сумму на экран.