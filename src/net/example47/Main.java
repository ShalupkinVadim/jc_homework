package net.example47;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "c:/Users/Hello/Desktop/workspace/java/education/HomeWork/src/by/exercise47/fileText.txt";
        UserOutput userOutput = new UserOutput(pathToFile);
        userOutput.showNumberOfWords();
        userOutput.showNumberOfMarks();
    }
}
