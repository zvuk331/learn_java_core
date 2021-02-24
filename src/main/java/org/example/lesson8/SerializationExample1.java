package org.example.lesson8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Pavel");
        employees.add("Ivan");
        employees.add("Elena");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employess.bin"))){
            outputStream.writeObject(employees);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
