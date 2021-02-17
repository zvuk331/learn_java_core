package org.example.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> array = new ArrayList<>();
        for (int i =0; i < 5; i++){
            array.add(i);
        }
        List<Integer> synchArray =Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = ()->synchArray.addAll(array);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchArray);
    }
}
