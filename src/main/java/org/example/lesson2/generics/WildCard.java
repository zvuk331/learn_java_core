package org.example.lesson2.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<? super Integer> superInt = new ArrayList<Number>();

        strings.add("Hello");
        strings.add("World");
        strings.add("Hehe");

        numbers.add(5);
        numbers.add(5.64);
        numbers.add(97);

        showInfoList(strings);
        showInfoList(numbers);

        System.out.println(summ(numbers));
    }
    public static void showInfoList(List<?> list) {
        System.out.println("List have this elements: " + list);
    }

    public static double summ(List<? extends Number> numbers){
        double summ = 0;
        for (Number n : numbers){
            summ += n.doubleValue();
        }
        return summ;
    }
}

