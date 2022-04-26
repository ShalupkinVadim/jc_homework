package net.example46;

public class Main {
    public static void main(String[] args) {
        Console.invitation();
        String path = Console.inputPath();
        FoldersFiles foldersFiles = new FoldersFiles(path);
        foldersFiles.separate();
        Console.show(foldersFiles.getFiles());
        Console.show(foldersFiles.getFolders());
    }
}