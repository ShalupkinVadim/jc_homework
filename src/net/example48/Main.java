package net.example48;

import net.example47.ReadFile;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "c:\\Users\\Hello\\Desktop\\workspace\\java\\education\\HomeWork\\src\\by\\exercise48\\fileText.txt";
        ArrayList<String> listTokens = new ReadFile(pathToFile).getText();
        TextNumber textNumber = new TextNumber();
        textNumber.findNumbers(listTokens,"(\\d?+[,.?]\\d+.?)|(\\d+.?)");
        UserOutput.show(textNumber);
        UserOutput.showSum(textNumber);
        textNumber.removeRepeatNumbers();
        UserOutput.show(textNumber);

    }
}
