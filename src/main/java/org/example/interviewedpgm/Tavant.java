package org.example.interviewedpgm;


public class Tavant {
    public static void main(String[] args) {
        // print Odd and Even number in based using multithreading
        EvenOdd evenOdd = new EvenOdd(15);
        Thread evenThread = new Thread(evenOdd::evenThread);
        Thread oddThread = new Thread(evenOdd::oddThread);
        evenThread.start();
        oddThread.start();

    }
}
