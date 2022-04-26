package net.example40;

import net.example39.*;

public class Main {
    public static void main(String[] args) {
        ListInt listInt = new ListInt();
        listInt.fillRandomList(20);
        Console.showList(listInt);
        listInt.rmRepeatNumbers();
        Console.showList(listInt);
    }
}
