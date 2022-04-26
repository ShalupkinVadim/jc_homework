package net.example49;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(20);
        //Console.show(numbers); // not necessary;
        OutInBinaryFile outInBinaryFile = new OutInBinaryFile("binaryFile");
        outInBinaryFile.writeFile(numbers);
        ArrayList<Integer> numbersFromFile = outInBinaryFile.readFile();
        Console.showNumbersFromFile(numbersFromFile);
        double averageArithmetic = numbers.averageArithmetic(numbersFromFile);
        Console.showAverageArithmetic(averageArithmetic);
    }
}
