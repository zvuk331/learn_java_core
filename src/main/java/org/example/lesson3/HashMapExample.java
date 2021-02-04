package org.example.lesson3;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pavel", 10);
        map.put("Filip", 9);
        map.put("Kenny", 102);
        map.put("Egor", 120);
        map.put("Max", 94);

        System.out.println(map);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Zaur", 5);
        treeMap.put("Egor", 3);
        treeMap.put("Petya", 2);
        treeMap.put("Vanya", 1);
        System.out.println(treeMap);


    }
}
