package lesson9;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDimArr = new int[3][3];
        int[][] twoDimmArrInit = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
        };

        showTwoDArr(twoDimmArrInit);
    }

    public static void showTwoDArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

