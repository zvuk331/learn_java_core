package org.example.lesson6;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {5,7,9,2,4,3,85,43,56,74,23};
//        array = Arrays.stream(array).sorted().toArray();
////        System.out.println(Arrays.toString(array));
        int result = Arrays.stream(array).filter(e -> e%2==1).map(e-> {
            if (e % 3 ==0) {
                e/=3;

            }return e;
        } ).reduce((r,e) -> r+=e).getAsInt();
        System.out.println(result);
        // 5 7 9 3 85 43 23
        // 5 7 3 1 85 43 23

    }
}
