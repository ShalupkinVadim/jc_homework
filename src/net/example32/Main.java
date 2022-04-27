package net.example32;

import net.example32.appliance.kitchen.device.*;

public class Main {

    public static void main(String[] args) {


        CoffeMachine coffeeMachine = new CoffeMachine("Philips","coffee machine",
                "red");
        coffeeMachine.turnOn();
        coffeeMachine.setVolume(2);
        coffeeMachine.makeCoffee();

        Microwave microwave = new Microwave("Samsung","microwave","white",
                20,30);
        // microwave.turnOn();
        microwave.setFood("some food");
        microwave.warmingFood();

    }
}
