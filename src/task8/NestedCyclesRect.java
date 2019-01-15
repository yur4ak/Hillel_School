package task8;

public class NestedCyclesRect {
    public static void main(String[] args) {
        // nested loops
        //int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

//вывести на экран 5x5 квадрат как на экране ниже с помощью вложенных циклов :
//x 0 0 0 0
//0 x 0 0 0
//0 0 x 0 0
//0 0 0 x 0
//0 0 0 0 x