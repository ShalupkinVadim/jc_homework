package net.example28;

public class TransformString {
    private char lastLetterWord(String string) {
        return string.charAt(string.length()-1);
    }

    public void lastLettersWords(String[] arrWord) {
        for (String element : arrWord) {
            System.out.print(lastLetterWord(element) + " ");
        }
    }
}
