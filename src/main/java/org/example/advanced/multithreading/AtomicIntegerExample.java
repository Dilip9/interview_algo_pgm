package org.example.advanced.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    // what is atomic integer
    /*
    * An AtomicInteger is a class in the java.util.concurrent.atomic package that provides an integer value which can be updated atomically.
    * This means that the operations on the AtomicInteger are thread-safe without using synchronization. It supports atomic operations like increment,
    * decrement, and compare-and-set.
    *
    * */
    private static final AtomicInteger counter= new AtomicInteger(0);
    public static void main(String[] args) {

        Runnable increment  = () -> System.out.println("Counter "+counter.incrementAndGet()+" Thread Name "+Thread.currentThread().getName());

        new Thread(increment, "t1").start();
        new Thread(increment, "t2").start();
        new Thread(increment,"t3").start();
        new Thread(increment, "t4").start();

    }
}
