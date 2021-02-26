package org.example.lesson7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test3 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread thread1 = new Thread(new Employee("Pasha", lock));
        Thread thread2 = new Thread(new Employee("Ivan", lock));
        Thread thread3 = new Thread(new Employee("Olesya", lock));
        Thread thread4 = new Thread(new Employee("Nastya", lock));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
class Employee implements Runnable{
    String name;
    Lock lock;

    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Банкомат освободился");
            lock.unlock();
        }
        else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}
