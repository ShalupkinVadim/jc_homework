package net.example3page19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1_000_000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25F;
        double d = .00001234;
        boolean bool = true;
        System.out.println("byte b == " + b); // 85
        System.out.println("short s == " + s); // 22015
        System.out.println("int i == " + i); // 1000000
        System.out.println("long l == " + l); // 4_294_967_295
        System.out.println("char c == " + c); // a
        System.out.println("float f == " + f); // 0.25
        for (String s1 : Arrays.asList(String.format("double d == %.8f", d), "boolean bool == " + bool)) {
            System.out.println(s1); // 0.00001234
        }// true
    }
}