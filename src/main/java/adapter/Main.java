package adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var fileIo = new FileProperties();
        try {
            fileIo.readFromFile("file.txt");
            fileIo.setValue("Apple", "iPhone");
            fileIo.setValue("Google", "Android");
            fileIo.setValue("Git", "hub");
            fileIo.setValue("DesignPattern", "Adapter");
            fileIo.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
