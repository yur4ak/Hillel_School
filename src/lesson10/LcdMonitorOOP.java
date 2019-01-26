package lesson10;

import javax.management.monitor.Monitor;

public class LcdMonitorOOP {
    private int size; // 0
    private String color = "black";

    private int brigjtness = 50;
    private int contrast = 50;
    private boolean state; // false

    private static String type = "LCD";

    public void power(){
        state = !state;
    }

    public void increaseContr(){
        contrast++;
    }
    public void decreaseContr(){
        contrast--;
    }

    public static void main(String[] args) {
        LcdMonitorOOP myLovelyMonitor = new LcdMonitorOOP();
        myLovelyMonitor.power();
        myLovelyMonitor.decreaseContr();
    }

}
