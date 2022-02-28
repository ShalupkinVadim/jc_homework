package net.example5;

public class Main {
    public static void main(String[] args) {
        int s = 5687949;
        int week = s/(7*24*3600);
        int day = (s - week*7*24*3600)/(24*3600);
        int hour = (s - week*7*24*3600 - day*24*3600)/3600;
        int minute = (s - hour*3600 - week*7*24*3600 - day*24*3600)/60;
        int sec = s%60;

        System.out.println(hour + " hours " + minute + " minutes " + sec + " seconds " + day
                + " days " + week + " weeks ");
    }
}
