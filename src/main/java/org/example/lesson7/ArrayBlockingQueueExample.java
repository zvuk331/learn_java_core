package org.example.lesson7;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Add " + i + " " + queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            try {

            while (true){
                    Integer j = queue.take();
                    System.out.println("Take " + j);
                    Thread.sleep(3000);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
