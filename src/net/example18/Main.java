package net.example18;

import net.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.fillRandomArray();
        String out = array.lastElementOfArray();
        array.outArray(array.getArray());
        System.out.println(out);
    }
}
