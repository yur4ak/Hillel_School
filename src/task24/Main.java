package task24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kyiv");
        cities.add("Kharkiv");
        cities.add("Dnipro");
        cities.add("Lviv");
        cities.add("Kherson");
        System.out.println(getSpecialCities(cities));

    }

    public static ArrayList<String> getSpecialCities(ArrayList<String> cityList) {
        String kFind;
        ArrayList<String> newCityList = new ArrayList<>();

        for (int i = 0; i < cityList.size(); i++) {
            kFind = cityList.get(i);
            if (kFind.charAt(0) == 'K') {
                newCityList.add(cityList.get(i));
            }
        }
        return newCityList;
    }
}

//    Написать метод принимающий список городов, который должен
//    вернуть список из всех городов название которых начинаются на букву “К”.