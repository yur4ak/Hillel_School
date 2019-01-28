package lesson10;

import javax.management.monitor.Monitor;

public class LcdMonitorOOP {
    private static int counter = 0;
    private static final int LIMIT = 100;

    private static String brand = "TRUBA";
    private int size; // 0
    private String color; //null

    private int brightness = 50;
    private int contrast = 50;
    private boolean state; // false

    public LcdMonitorOOP(int s, String c) { //overloaded
        size = s;
        color = c;
        counter++;
    }

    public LcdMonitorOOP(int s, String c, int br, int con) { // constructor
        size = s;
        color = c;
        brightness = br;
        contrast = con;
        counter++;
    }

    public LcdMonitorOOP() { //overloaded
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }

    public void power() {
        state = !state;
    }

    public void increaseContr() {
        if (contrast < LIMIT) {
            contrast++;
        }
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        LcdMonitorOOP.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getContrast() {
        return contrast;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        String result = "Monitor: " + "[" + "size = " + size + " Color: " + color + "]";
        return result;
    }

    public void decreaseContr() {
        if (contrast > 0) {
            contrast--;
        }
    }
}
