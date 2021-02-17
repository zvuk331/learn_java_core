package org.example.lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectiosExample2 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            array.add(i);
        }
        List<Integer> synchArray = Collections.synchronizedList(array);
        System.out.println(synchArray);

        Runnable runnable = () -> {
            synchronized (synchArray) {
                Iterator<Integer> iterator = synchArray.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> synchArray.remove(10);


        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchArray);

    }
}
