package org.example.lesson7;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListExample {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
        list.add("Pavel");
        list.add("Alem");
        list.add("Sergey");
        list.add("Igor");
        list.add("Denis");

        Runnable runnable1 = ()->{
            try {
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()){
                    Thread.sleep(100);
                    System.out.println(iterator.next());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(300);
                list.remove(4);
                list.add("Oleg");
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
        System.out.println(list);
    }
}
