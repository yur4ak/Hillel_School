package task6;

public class DoWhileReverse {
    public static void main(String[] args) {

        simplDoWhile();
    }

    public static void simplDoWhile (){
        int x = 10;
        System.out.println("Reverse count: " + x);
        do {
            x--;
            System.out.println("Reverse count: " + x);
        } while (x > 0);
    }
}

//Организовать цикл do..while обратного отсчета от 10 до 1 в выводом на экран.
//сделать как отдельный метод.