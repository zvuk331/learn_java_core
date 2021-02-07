package org.example.lesson6;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5,1,3,8,9};
//        Arrays.stream(array).forEach(e -> {e *=2;System.out.println(e);});
        Arrays.stream(array).forEach(Utils::uMethod);
        System.out.println();


    }
}
class Utils {
    public static void uMethod(int a){
        a += 5;
        System.out.println(a);
    }
}
