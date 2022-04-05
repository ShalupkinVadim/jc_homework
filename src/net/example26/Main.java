package net.example26;

import net.example26.InputOutputData;
import net.example26.Marks;

public class Main {
    public static void main(String[] args) {
        InputOutputData data = new InputOutputData();
        String input = data.getStringLine();
        String[] marks = data.getMarks();
        Marks count = new Marks();
        data.outData(count,input,marks);
    }
}
