package org.example.lesson8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")){

            int a = file.read();
            System.out.println((char) a);
            String s = file.readLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
