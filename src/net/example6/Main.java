package net.example6;

public class Main {

    public boolean isLastDigitSeven(int num) {
        Integer number = num;
        String str = number.toString();
        return str.charAt(str.length()-1) == '7';
    }

    public static void main(String[] args) {
        System.out.println(new Main().isLastDigitSeven(475888877));
    }
}