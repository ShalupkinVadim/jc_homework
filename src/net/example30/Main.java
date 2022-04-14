package net.example30;

import net.example29.ReadConsole;
import net.example30.ChangeSubstring;

public class Main {
    public static void main(String[] args) {
        String input = ReadConsole.getString();
        StringBuilder out = ChangeSubstring.replaceParagraph(input);
        System.out.println(out);
    }
}
