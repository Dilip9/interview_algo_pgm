package org.example.advanced.multithreading;

public class PrintNumberInEvenOdd {
    public static void main(String[] args) {
        PrintNumber number = new PrintNumber(12);
        Thread t1 = new Thread(number::oddNumber, "OddThread");
        Thread t2 = new Thread(number::evenNumber, "EvenThread");
        t1.start();
        t2.start();
    }
}

