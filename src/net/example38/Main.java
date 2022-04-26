package net.example38;

public class Main {
    public static void main(String[] args) {
        Garage<Car> car = new Garage<>(new Fields().car());
        ToConsole.vehicleGarage(car);

        Garage<Motorcycle> moto = new Garage<>(new Fields().moto());
        ToConsole.vehicleGarage(moto);
    }
}
