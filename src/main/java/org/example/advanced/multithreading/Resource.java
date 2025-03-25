package org.example.advanced.multithreading;

public class Resource {

    public void method1(Resource resource2){
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + "locked resource 1");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource2){
                System.out.println(Thread.currentThread().getName() +" locked resource2");
            }
        }
    }

    public void method2(Resource resource1){
        synchronized (this){
            System.out.println(Thread.currentThread().getName() +" locked resource 2");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource1){
                System.out.println(Thread.currentThread().getName() +" locked resource 1");
            }
        }
    }
}
