package lesson10;

public class LcdMonitorApp {
    public static void main(String[] args) {
        LcdMonitorOOP myLovelyMonitor = new LcdMonitorOOP();
        myLovelyMonitor.power();
        myLovelyMonitor.increaseContr();
        myLovelyMonitor.increaseContr();
        myLovelyMonitor.decreaseContr();

        LcdMonitorOOP myMonitor2 = new LcdMonitorOOP();
        myMonitor2.power();
        myMonitor2.increaseContr();
        System.out.println(myMonitor2.toString());

        LcdMonitorOOP monitor1 = new LcdMonitorOOP(27,"White");
        LcdMonitorOOP monitor2 = new LcdMonitorOOP(32,"Black");
        LcdMonitorOOP monitor3 = new LcdMonitorOOP(38, "Yellow", 30, 30);
        LcdMonitorOOP monitor5 = new LcdMonitorOOP();
        LcdMonitorOOP monitor6 = new LcdMonitorOOP();

        monitor6.setSize(38);

        LcdMonitorOOP monitor7 = new LcdMonitorOOP();
        monitor7.setColor("pink");
        LcdMonitorOOP monitor8 = new LcdMonitorOOP(10, "Brown");
        monitor8.setBrand("Startup");


        System.out.println(monitor7.getColor());
        System.out.println("monitor6 size: = " + monitor6.getSize());
        System.out.println(monitor1);
        System.out.println(monitor6.getBrand());
        System.out.println(monitor8.getBrand());
        System.out.println("Parent class was called: " + LcdMonitorOOP.getCounter());
    }
}
