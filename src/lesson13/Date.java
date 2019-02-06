package lesson13;

public class Date {
    enum Seasons {
        winter, spring, summer, autumn
    }

    enum Days {
        mn, tw, wd, th, fr, st, sn
    }

    public static void main(String[] args) {
        Days myLoveDay = Days.st;
        System.out.println(getSeason(Seasons.spring));
    }



    public static int getSeason(Seasons season) {
        switch (season) {
            case autumn:
                return 4;
            case spring:
                return 2;
            case summer:
                return 3;
            case winter:
                return 1;
            default:
                return -1;
        }
    }
}
