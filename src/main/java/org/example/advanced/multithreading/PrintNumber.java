package org.example.advanced.multithreading;

public class PrintNumber {

    private final int limit ;
    private int startingNumber = 1;

    public PrintNumber(int limit){
        this.limit  = limit;
    }

    public synchronized void oddNumber(){
        while(startingNumber<limit){
            while(startingNumber%2==0){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println( Thread.currentThread().getName() +" - "+startingNumber);
            startingNumber++;
            notify();
        }
    }
    public synchronized void evenNumber(){
        while(startingNumber<limit){
            while(startingNumber % 2 !=0){
                try{
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() +" - "+ startingNumber);
            startingNumber++;
            notify();
        }

    }
}
