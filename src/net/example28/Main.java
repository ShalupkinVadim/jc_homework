package net.example28;

import net.example27.ReadConsole;
import net.example27.TransformText;
import net.example28.TransformString;

public class Main {
    public static void main(String[] args) {
        String str = new ReadConsole().textToString("@");
        String[] arrWord = new TransformText().textToWordArray(str);
        new TransformString().lastLettersWords(arrWord);
    }
}
