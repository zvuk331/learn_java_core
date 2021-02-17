package org.example.lesson7;

public class InterruptedThread  extends Thread{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main thread ends");
    }

    @Override
    public void run() {
        double sqrtSum = 0;
        for (int i = 1; i<=1000000000; i++){
            if (isInterrupted()){
                System.out.println("Thread want to end");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread хотят прервать, давайте завершим его работу");
                return;
            }
        }
        System.out.println("Сумма корней равна " + sqrtSum);
    }
}
