package lesson16;

import java.util.Arrays;
import java.util.Random;

public class DynamicArray {
    private final int RATIO_EXPENDING = 2;
    private int[] elements;
    private int counter;

    public DynamicArray(int size, char sep) {
        elements = new int[size];
    }

    public int getSize() {
        return elements.length;
    }

    public int get(int i) {
        int result = 0;
        if (i < elements.length && i >= 0) {
            result = elements[i];
        }
        return result;
    }

    public void put(int e) {
        if (counter == elements.length - 1) {
            //int[] newArr = new int[elements.length * RATIO_EXPENDING];
            elements = Arrays.copyOf(elements, elements.length * RATIO_EXPENDING);
        }

        elements[counter++] = e;
    }

//    @Override
//    public String toString() {
//        return "DynamicArray{" + "elements=" + Arrays.toString(elements) + '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= counter; i++) {
            sb.append(elements[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
