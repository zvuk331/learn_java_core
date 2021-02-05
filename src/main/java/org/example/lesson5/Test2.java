package org.example.lesson5;

public class Test2 {
    public static void main(String[] args) {
        def((String s) -> {return s.length();});

    }
    static void def(I i ){
        System.out.println(i.abc("Type Hyper"));
    }
}

interface I{
    int abc(String s);
}
