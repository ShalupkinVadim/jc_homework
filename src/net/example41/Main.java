package net.example41;

import net.example39.*;

public class Main {
    public static void main(String[] args) {
        ListInt listMark = new ListInt();
        listMark.fillRandomList(5);
        Console.showList(listMark);
        int maxMark = listMark.maxMark();
        Console.showMark(maxMark);
    }
}