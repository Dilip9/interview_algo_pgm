package org.example.advanced.multithreading;

import java.util.concurrent.*;

public class CallAndFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit(new SumTask(10));
        try{
            System.out.println(" Sum of results : "+future.get());
        }catch (InterruptedException | ExecutionException e){
            e.getStackTrace();
        }
        executorService.shutdown();

    }
}
