package org.example.lesson7;

import java.util.concurrent.*;

public class CallableFactorial implements Callable {
    int f;
    static int factorialResult;

    public CallableFactorial(int f) {
        this.f = f;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFactorial callableFactorial = new CallableFactorial(7);
        Future<Integer> future = executorService.submit(callableFactorial);
        try {
            factorialResult = future.get();
        } catch (ExecutionException e) {
            e.getCause();
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);

    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (f < 0){
            throw new Exception("Вы ввели неверное число!");
        }
        for (int i = 1; i <=f; i++){
            result*=i;
        }
//        factorialResult = result;
        return result;
    }
}
