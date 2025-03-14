package org.example.advanced.multithreading;

public class Producer implements Runnable{
    private SharedBufferResource buffer;


    public Producer(SharedBufferResource buffer){
        this.buffer = buffer;

    }

    @Override
    public void run(){
        int item = 0;
        while(true){
            try{
                buffer.addItem(item++);
                Thread.sleep(1000); // simulate time to produce an item.
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
