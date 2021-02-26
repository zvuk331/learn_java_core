package org.example.lesson7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample2 implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService.schedule(new ThreadPoolExample2(), 3, TimeUnit.SECONDS);

//        scheduledExecutorService.scheduleAtFixedRate(new ThreadPoolExample2(), 3,1,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new ThreadPoolExample2(), 3,1,TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End work");
    }

}
