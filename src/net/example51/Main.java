package net.example51;

public class Main {
    public static void main(String[] args) {
        GeneratorPerson generatorPerson = new GeneratorPerson(10);
        generatorPerson.writeFile("personsInfo.txt");
    }
}
