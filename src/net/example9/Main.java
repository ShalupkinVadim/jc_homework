package net.example9;

import java.time.LocalDate;

public class Main {

    public void nextDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year,month,day);
        date = date.plusDays(1);
        System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear());
    }

    public static void main(String[] args) {
        new Main().nextDay(28,2,2022);
    }
}