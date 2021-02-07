package org.example.lesson6;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Good");
        list.add("Neci");
        list.add("Yes");

//        for (int i = 0; i < list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5,9,1,8,3};
        array = Arrays.stream(array).map(element ->{
            if (element % 3 ==0){
                element /=3;

            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Good");
        set.add("Yes");
        set.add("Nice");

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(set2);
    }
}
