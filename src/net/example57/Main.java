package net.example57;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(200);
        System.out.println(queue);
        new Producer("Producer-1",queue);
        new Producer("Producer-2",queue);
        new Producer("Producer-3",queue);
        new Consumer("Consumer-1",queue);
        new Consumer("Consumer-2",queue);
    }
}
