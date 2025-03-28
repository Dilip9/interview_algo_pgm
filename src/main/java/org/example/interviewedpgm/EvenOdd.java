package org.example.interviewedpgm;

public class EvenOdd{
    private final int limit;
    private int start = 1 ;

    EvenOdd(int limit){
        this.limit = limit;
    }

    public synchronized void evenThread(){
        while(start<limit){
            while(start % 2 != 0){
                try{
                    wait();
                }catch (InterruptedException e){
                    System.out.println("Exception occurred "+e.getMessage());
                }
            }
            System.out.println("Even "+start);
            start++;
            notify();
        }
    }

    public synchronized void oddThread(){
        while(start<limit){
            while(start % 2 == 0){
                try{
                  wait();
                }catch (InterruptedException e){
                    System.out.println("Exception occurred "+e.getMessage());
                }
            }
            System.out.println("Odd "+start);
            start++;
            notify();
        }
    }
}
