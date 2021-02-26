package org.example.lesson8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample2 {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("F:\\Фигура 16.png");
            FileOutputStream outputStream = new FileOutputStream("H:\\Фигура 16.png");

                ){
            int i;
            while ((i=inputStream.read()) !=-1){
                outputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
