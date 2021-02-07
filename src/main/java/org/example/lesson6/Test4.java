package org.example.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        int result = list.stream().reduce((accum, el) -> accum += el).get();
        int result2 = list.stream().reduce(1,(accum, el) -> accum += el);
        System.out.println(result2);

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> res = list2.stream().reduce((ac,el) -> ac*=el);
        if (res.isPresent()){
            System.out.println(res);
        } else {
            System.out.println("List2 isn't present!");
        }

        List<String> list3 = List.of("Hello", "Pasha", "You", "are", "my","fiend");
        String str = list3.stream().reduce((a,e) -> a + " " + e).get();
        System.out.println(str);
        if (list3 instanceof ArrayList){
            System.out.println(true);
        } else if (list3 instanceof LinkedList){
            System.out.println(false);
        }
    }
}
