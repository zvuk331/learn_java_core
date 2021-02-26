package org.example.lesson8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("C:\\Users\\zvuk3\\Desktop\\text1.txt")) {
            int character;
            while ((character = reader.read()) != -1){
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
