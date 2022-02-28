package net.example7;

public class Main {

    public boolean isCovers(int a, int b, int r) {
        if(a < 0 || b < 0 || r < 0) {
            System.out.println("Negative! Try one more time.");
            return false;
        }
        double d = Math.hypot((double) a, (double) b);
        return d <= 2*r;
    }

    public static void main(String[] args) {
        System.out.println(new Main().isCovers(6,8,5));
    }
}