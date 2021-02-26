package org.example.lesson7;

public class VolatileExample extends Thread{
    volatile public boolean b = true;
    long counter = 0;
    @Override
    public void run() {
        while (b){
            counter++;
        }
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds");
        volatileExample.b = false;
        volatileExample.join();
        System.out.println("End the program!");
    }
}
