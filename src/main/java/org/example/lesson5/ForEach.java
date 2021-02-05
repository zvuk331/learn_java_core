package org.example.lesson5;


import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Good", "Nice");
        List<Integer> integers = List.of(1,2,3,4,5);
        integers.forEach(System.out::println);
    }
}
