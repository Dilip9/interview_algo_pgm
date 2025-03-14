package org.example.advanced.multithreading;

public class Consumer implements Runnable{

    private SharedBufferResource buffer;

    public Consumer(SharedBufferResource buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        while(true){
            try{
                buffer.removeItem();
                Thread.sleep(1000); //simulate time to consume an item.
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

