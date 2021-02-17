package org.example.lesson7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample implements Runnable{
    static AtomicInteger counter = new AtomicInteger();
    static void increment(){
        counter.incrementAndGet();
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new AtomicIntegerExample());
        Thread thread2 = new Thread(new AtomicIntegerExample());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
        System.out.println("Main method ends");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            increment();
        }
    }
}
