package net.example25;

import net.example25.shape.*;

public class
Main {
    public static void main(String[] args) {
        Atm atm = new Atm(4,5,5);
        String input = GetData.defaultData();
        GetData.getMoney(input, atm);
        GetData.addMoney(input, atm);
    }
}
