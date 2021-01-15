package org.example.lesson2.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Hello");
        System.out.println(info);
    }
}
class Info<T> {
    public T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
}
