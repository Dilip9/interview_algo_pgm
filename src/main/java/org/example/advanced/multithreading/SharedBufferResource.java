package org.example.advanced.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBufferResource {

    private final int bufferSize = 10; // Maximum buffer size which can be hold by queue/shared resource.
    private Queue<Integer> dataStorage = new LinkedList<>();

    public synchronized void addItem(Integer item) throws InterruptedException{
        while(dataStorage.size() == bufferSize){
            wait(); // wait until space is available.
        }
        dataStorage.add(item);
        System.out.println("::: Produced ::: "+item);
        notifyAll(); // Notify consumer that there's an item available.
    }

    public synchronized Integer removeItem() throws InterruptedException{
        while(dataStorage.isEmpty()){
            wait(); // wait until an item is available.
        }
        Integer item = dataStorage.poll();
        System.out.println(":: Consumed :: "+item);
        notifyAll();
        return item;
    }
}
