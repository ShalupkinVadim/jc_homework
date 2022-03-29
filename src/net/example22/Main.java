package net.example22;

import net.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(11);
        array.fillRandomArrayFromOneToTen();
        array.outArray(array.getArray());
        array.reverse(array.getArray());
        array.outArray(array.getArray());
    }
}
