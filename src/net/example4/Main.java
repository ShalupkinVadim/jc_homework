package net.example4;

public class Main {

    public long someMethod(long a, long b) {
        return a+b+a*b;
    }

    public static void main(String[] args) {
        System.out.println(new Main().someMethod(256,859));
    }
}
