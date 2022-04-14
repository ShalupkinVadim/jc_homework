package net.example29;

import java.util.Scanner;

public class ReadConsole {
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
