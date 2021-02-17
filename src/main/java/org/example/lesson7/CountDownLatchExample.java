package org.example.lesson7;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        new Friend("Pavel", countDownLatch);
        new Friend("Sergey", countDownLatch);
        new Friend("Alem", countDownLatch);
        new Friend("Denis", countDownLatch);
        new Friend("Igor", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready so let's open market");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }
}
class Friend extends Thread{
    private String name;
    CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил(а) к покупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
