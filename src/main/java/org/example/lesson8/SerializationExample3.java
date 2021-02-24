package org.example.lesson8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample3 {
    public static void main(String[] args) {
        Employee employee = new Employee("Pavel", 21,200000,"IT", new Car("BMW", "Black"));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.bin"))){
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
