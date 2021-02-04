package org.example.lesson3;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();
        strings.add("PAvel");
        strings.add("Igor");
        strings.add("Vadim");
        strings.add("Kanat");
        System.out.println(strings);
    }
}
