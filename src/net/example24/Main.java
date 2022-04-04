package net.example24;

import net.example24.TimeInterval;

public class Main {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(9525);
        System.out.println(timeInterval);

        TimeInterval timeInterval1 = new TimeInterval(9525);
        System.out.println(timeInterval1);

        TimeInterval timeInterval2 = new TimeInterval(1000000);
        System.out.println(timeInterval2);

        System.out.println(timeInterval.compareTo(timeInterval1));
        System.out.println(timeInterval.compareTo(timeInterval2));
        System.out.println(timeInterval2.compareTo(timeInterval1));

        TimeInterval timeInterval3 = new TimeInterval(2,100,16);
        System.out.println(timeInterval3.getAllTimeInObject());
        System.out.println(timeInterval3);

        TimeInterval timeInterval4 = new TimeInterval(3,10,5);
        System.out.println(timeInterval3.compareTo(timeInterval4));
        System.out.println(timeInterval4);
    }
}
