package org.example.lesson7;

public class Test1 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; i--){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread4 myThread4 = new MyThread4();
        Thread thread = new Thread(new MyThread4());
        Test1 mythread = new Test1();
        thread.start();
//        Thread.sleep(1000);
        mythread.start();

        mythread.join();
        thread.join();
        System.out.println("The end!");
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <=10;i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
