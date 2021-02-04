package org.example.lesson3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Pavel");
        list1.add("Sergey");
        list1.add("Alem");

        List<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");

        list1.addAll(list2);
        System.out.println(list1);

        list1.set(4, "777");
        System.out.println(list1);
        System.out.println(list2);

        list1.removeAll(list2);
        System.out.println(list1);

        list1.retainAll(list2);
        System.out.println(list1);


    }
}
