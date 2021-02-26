package org.example.lesson7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++){
            executorService.execute(new ThreadPoolExample());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main thread ends");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
