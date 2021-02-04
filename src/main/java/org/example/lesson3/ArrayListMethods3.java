package org.example.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Pavel");
        list1.add("Sergey");
        list1.add("Vasya");
        list1.add("Petya");
        list1.add("Oleg");
        list1.add("King");

        List<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");

        List<String> list3 = list1.subList(1,3);  // корируют коллекцию с индекса 1 по 3 (3 не входит)
        System.out.println(list3);

        String[] array = list1.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
