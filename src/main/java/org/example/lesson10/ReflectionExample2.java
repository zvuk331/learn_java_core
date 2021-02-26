package org.example.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            Calculator calculator = new Calculator();
            Class calculatorClass = calculator.getClass();

            String nameMethod = reader.readLine();
            String firstArgument = reader.readLine();
            String lastArgument = reader.readLine();

            Method method = null;
            Method[] methods = calculatorClass.getDeclaredMethods();
            for (Method m: methods){
                if (m.getName().equals(nameMethod)){
                    method = m;
                }
            }
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(lastArgument));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
