package org.example.lesson7;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"Pavel");
        map.put(2,"Sergey");
        map.put(3,"Alem");
        map.put(4,"Denis");
        map.put(5,"Igor");

        Runnable runnable1 = ()->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                    Integer i = iterator.next();
                    System.out.println(i + ":" + map.get(i));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(300);
                map.put(6,"Ivan");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
