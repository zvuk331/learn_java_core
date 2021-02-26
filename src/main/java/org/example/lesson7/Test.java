package org.example.lesson7;

public class Test {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        System.out.println("Name 1: " + myThread1.getName() + ", priority: " + myThread1.getPriority());
        System.out.println("Name 2: " + myThread2.getName() + ", priority: " + myThread2.getPriority());

        myThread1.setName("First");
        myThread2.setName("Second");
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(7);
        System.out.println();
        System.out.println("Name 1: " + myThread1.getName() + ", priority: " + myThread1.getPriority());
        System.out.println("Name 2: " + myThread2.getName() + ", priority: " + myThread2.getPriority());

//        myThread1.start();
//        myThread2.start();

//        Thread thread3 = new Thread(new MyThread3());
//        thread3.start();
//        new Thread(() -> {
//            for (int i =1; i <=1000; i++){
//                System.out.println(i);
//            }
//        }).start();

    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=1000; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1000; i >0; i--){
            System.out.println(i);
        }
    }
}
class MyThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <20; i++){
            System.out.println("Hello");
        }
    }
}
