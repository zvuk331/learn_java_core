package org.example.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream stream1 = Stream.of(1,2,3,4);
        Stream stream2 = Stream.of(5,6,7,8);

        Stream stream3 = Stream.concat(stream1,stream2);
//        stream3.forEach(System.out::println);

        Stream stream4 = Stream.of(1,2,3,4,5,6,2,3,1);
//        stream4.distinct().forEach(System.out::println);
//        System.out.println(stream4.count());
        System.out.println(stream4.distinct().peek(System.out::println).count());
    }
}
