package lesson7;

public class NestedCycles {
    public static void main(String[] args) {
        twoCycles();
    }

    public static void twoCycles() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                //System.out.println("i = " + i + "; " + "j = " + j + "; ");
                //System.out.print("i = " + i + "; ");
                // System.out.print("j = " + j + "; ");
                System.out.println(Math.pow(2, 0));
                System.out.printf("i = %d ; j = %d; \n", i, j);


            }


        }
    }

}

/*
        int i = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.println("Current step = " + x);
            i = i+x;
            System.out.println("Res sum: " + i);
        }
}
*/