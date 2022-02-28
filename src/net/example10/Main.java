package net.example10;

public class Main {

    public boolean checkSquare(double a, double b, double c, double d, double e, double f) {
        double squareHouse1 = a * b;
        double squareHouse2 = c * d;
        double squareArea = e * f;
        return squareArea >= (squareHouse1 + squareHouse2);
    }

    public static void main(String[] args) {
        if(new Main().checkSquare(10,20,30,40,50,30)) {
            System.out.println("помещается");
        } else {
            System.out.println("не помещается");
        }

    }
}
