package org.example.advanced.multithreading;

public class ProducerConsumer {

    public static void main(String[] args){
        //Step1: Shared Buffer: fixed size of buffer or queue holds the data items produced by the producer.
            // This buffer is shared b/w producer and consumer and has limited capacity of it.
        SharedBufferResource bufferResource = new SharedBufferResource();

        //Step2: Producer can only add an item to the buffer if there is space available.
            // if it is full then will wait until space is freed by consumer.
            // Create producer thread to produce an item into buffer.
        Thread producerThread = new Thread( new Producer(bufferResource));
        //Step3: Consumer will consume the buffer or queue data.
            // If buffer is empty then consumer must wait the producer adds an item.
            // Create consumer thread to consume the buffer or queue data.
        Thread consumerThread = new Thread(new Consumer(bufferResource));
        // Now start the thread.
        producerThread.start();
        consumerThread.start();

    }

}
