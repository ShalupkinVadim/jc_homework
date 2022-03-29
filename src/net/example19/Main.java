package net.example19;

import net.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.fillRandomArray();
        array.outEvenElOfArray(array.getArray());
    }
}
