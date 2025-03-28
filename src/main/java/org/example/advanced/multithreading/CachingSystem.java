package org.example.advanced.multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachingSystem {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> hmap = new ConcurrentHashMap<>();

        Runnable writer = () -> {
            for(int i=1;i<=5;i++){
                hmap.put("Key- "+i, i);
                System.out.println(Thread.currentThread().getName() + " Added Key-" +i);
            }
        };

        Runnable reader = () -> {
            for (int i=0;i<=5;i++){

                System.out.println(Thread.currentThread().getName() + " Read " +hmap.get("Key- "+i));
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(writer);
        executorService.execute(reader);
        executorService.shutdown();
    }




}
