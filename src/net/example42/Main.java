package net.example42;

import net.example27.ReadConsole;

public class Main {
    public static void main(String[] args) {
        UserConsole.invite();
        String text = new ReadConsole().textToString("@");
        TextMap textMap = new TextMap(text);
        UserConsole.showMap(textMap);
    }
}
