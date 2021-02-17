package org.example.lesson7;

public class DaemonThread implements Runnable{
    public static void main(String[] args) {
        System.out.println("Main thread start");

        Thread thread1 = new Thread(new UserThread());
        Thread thread2 = new Thread(new DaemonThread());

        thread1.setName("UserThread");
        thread2.setName("DaemonThread");
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();

        System.out.println("Main thread end");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " является daemon thead: " + Thread.currentThread().isDaemon());
        for (int i = 0; i <=1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
class UserThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " является daemon thead: " + Thread.currentThread().isDaemon());
        for (char i = 'A'; i<='J'; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
