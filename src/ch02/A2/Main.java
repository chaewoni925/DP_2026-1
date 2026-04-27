package ch02.A2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");

            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");

            f.writeToFile("newfile.txt");

            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace(); //에러가 발생했을 때, 그 에러가 어디서 시작되어 어떻게 전달되었는지 추적(Trace)해서 화면에 출력(Print)
        }
    }
}
