package net.example33;

import net.example33.card.*;

public class Main {
    public static void main(String[] args) {
        String[] cardHolder = {"John","Doe"};
        PlasticCard plasticCard = new PlasticCard("BELARUSBANK", "VISA",
                "0000111122223333", "123", "1234", "Classic",
                cardHolder,4,true);
        System.out.println(plasticCard);
    }
}
