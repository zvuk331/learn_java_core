package org.example.lesson3;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] sbList = new StringBuilder[]{sb1,sb2,sb3,sb4};

        List<StringBuilder> list = Arrays.asList(sbList);
        System.out.println(list);
    }
}
