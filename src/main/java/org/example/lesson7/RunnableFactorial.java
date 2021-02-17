package org.example.lesson7;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial implements Runnable{
    int f;
    static int factorialResult = 1;

    public RunnableFactorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f < 0){
            System.out.println("Вы ввели неверное число");
        }
        for (int i=1; i <=f; i++){
           factorialResult*=i;
        }
        System.out.println(factorialResult);
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        RunnableFactorial runnableFactorial = new RunnableFactorial(6);
        executorService.execute(runnableFactorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
    }
}
