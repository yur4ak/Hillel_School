package task7;

public class OddPrint {
    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {
            if ((x % 2) == 1) {
                System.out.println("x = " + x);
            }
        }

    }
}

//Вывести на экран все нечетные числа в диапазоне от 1 до 100.
//Включая 1 и исключая 100.