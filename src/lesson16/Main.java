package lesson16;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DynamicArray da1 = new DynamicArray(10, ';');

        for (int i = 0; i < 25; i++) {
            da1.put(i);
        }

        System.out.println(da1.getSize());
        System.out.println(da1.toString());


        ArrayList<Integer> elements = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            elements.add(i);
        }

        System.out.println(elements.get(5));

        StringBuilder sb = new StringBuilder();

        sb.append("I");
        sb.append(" am");
        sb.append(" Student");

        String whoAreYou = sb.toString();
        System.out.println(whoAreYou);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(145);
        numbers.add(245);
        numbers.add(345);

        System.out.println(numbers.get(1));
        System.out.println(numbers.size());
        Object[] a = numbers.toArray();
        System.out.println(a[2]);

        Object[] arr = numbers.toArray();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("A");
        list1.add("b");
        list1.add("C");
        list2.add("z");
        list2.add("x");
        list2.add("y");

        list1.addAll(list2);
        System.out.println(list1.contains("d"));
        System.out.println(list1.contains("C"));

        System.out.println(list1.toString());

        list1.clear();
        System.out.println(list1.toString());

        ArrayList<String> subStrList = new ArrayList<>();

    }
}
