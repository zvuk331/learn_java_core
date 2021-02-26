package org.example.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers implements Callable<Long> {
    public static long value = 1_000_000_000L;
    public static long sum = 0;
    long from;
    long to;
    long localSum;

    public SumNumbers(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = value/10;
        for (int i = 0; i < 10; i++){
            long from = valueDividedBy10*i+1;
            long to = valueDividedBy10*(i+1);
            SumNumbers task = new SumNumbers(from,to);
            Future<Long> futurePartSum = executorService.submit(task);
            futureResults.add(futurePartSum);
        }
        for (Future<Long> result : futureResults){
            try {
                sum += result.get();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        System.out.println(sum);
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i < to; i++){
            localSum +=i;
        }
        System.out.println("From " + from + " to " + to + " result=" + localSum);
        return localSum;
    }
}
