package org.example.lesson7;

public class Test2 {
    volatile static long counter = 0;
    public static synchronized void increment(){counter++;}
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(Test2.counter);
    }
}
class R implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            Test2.increment();
        }
    }
}
