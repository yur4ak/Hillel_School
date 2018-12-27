// home work com.hillel.task3
package task3;

public class IsEvenOrOdd {
    public static void main(String[] args) {

        int setNum = 19; // set number here
        // logic for determination of parity
        if(setNum == 0) {  // check if 0 is initial number and break program flow if it is
            System.out.println("Wow it's a ZERO !!!");
        }
        else {
            if (basicOperation(setNum) == true) {
                System.out.println(setNum + " is an Even number");
            } else {
                System.out.println(setNum + " is an Odd number");
                }
            }
    }

    public static boolean basicOperation(int x) {
            int res = x % 2;
            if (res == 0) {
                return true; // 0 mean return Even is true
            } else {
                return false;
                }
        }
}
