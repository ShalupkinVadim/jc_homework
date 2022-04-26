package net.example39;

public class Main {

    public static void main(String[] args) {
        ListInt listMark = new ListInt();
        listMark.fillRandomList(20);
        Console.showList(listMark);
        listMark.rmNegativeMark();
        Console.showList(listMark);
    }
}
