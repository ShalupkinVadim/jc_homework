package net.example13;

import net.example13.FactorialBigInt;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger product = new FactorialBigInt().multiplyFromOneToTwentyFive();
        System.out.println(product);
    }
}
