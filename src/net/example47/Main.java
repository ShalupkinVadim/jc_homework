package net.example47;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "Документы/homework/src/net/example47/fileText.txt.txt";
        UserOutput userOutput = new UserOutput(pathToFile);
        userOutput.showNumberOfWords();
        userOutput.showNumberOfMarks();
    }
}
