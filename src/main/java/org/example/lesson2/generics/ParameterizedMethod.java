package org.example.lesson2.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(10);
        arr1.add(20);

        System.out.println(GenMethod.getSecondElement(arr1));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("fdg");
        arr2.add("ygfn");
        arr2.add("unbgj");

        System.out.println(GenMethod.getSecondElement(arr2));
    }


}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
