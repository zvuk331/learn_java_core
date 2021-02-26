package org.example.lesson7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(()-> call.mobileCall());
        Thread thread2 = new Thread(()-> call.skypeCall());
        Thread thread3 = new Thread(()-> call.whatsappCall());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("mobileCall starts");
            Thread.sleep(3000);
            System.out.println("mobileCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        try {
            System.out.println("skypeCall starts");
            Thread.sleep(5000);
            System.out.println("skypeCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void whatsappCall(){
        lock.lock();
        try {
            System.out.println("whatsappCall starts");
            Thread.sleep(7000);
            System.out.println("whatsappCall ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
