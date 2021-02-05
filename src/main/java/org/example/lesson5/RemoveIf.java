package org.example.lesson5;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("Hello goodbye");
        al.add("lemon");
        al.add("apple");
        al.add("fruits");

        al.removeIf(s -> s.length()<7);
        System.out.println(al);



        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            integers.add(i);
        }
        integers.removeIf(el -> el%2==0);
        System.out.println(integers);
    }

}
