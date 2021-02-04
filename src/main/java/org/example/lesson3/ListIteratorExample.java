package org.example.lesson3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madak";
        List<Character> list = new LinkedList<>();
        for (Character c : s.toCharArray()){
            list.add(c);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> iterator2 = list.listIterator(list.size());
        boolean palindrome = true;
        while (iterator.hasNext() && iterator2.hasPrevious()){
            if (iterator.next() != iterator2.previous()){
                palindrome = false;
                break;
            }

        }

        System.out.println(palindrome ? "Palindrome" : "Not palindrome");
    }
}
