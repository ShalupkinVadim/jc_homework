package net.example14;

import net.example14.Sum;

public class Main {
    public static void main(String[] args) {
        int number = new Sum().sumDigit(7893823445L);
        System.out.println(number);
    }
}