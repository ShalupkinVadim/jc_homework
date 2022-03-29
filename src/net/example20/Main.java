package net.example20;

import net.common.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.fillRandomArrayFromOneToTen();
        int maxElement = array.findMaxElOfArray();
        String indexes = array.outIndexesElOfArray(maxElement);
        outData(array,maxElement,indexes);
    }
    public static void outData(Array array,int maxElement, String indexes) {
        array.outArray(array.getArray());
        System.out.println("Max element: " + maxElement);
        System.out.println(indexes);
    }
}