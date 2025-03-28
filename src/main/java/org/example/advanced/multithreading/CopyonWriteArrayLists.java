package org.example.advanced.multithreading;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArrayLists {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Subscriber 1 ");
        list.add("Subscriber 2");

        Runnable writer  = () -> {
            list.add(" Subscriber 3");
            System.out.println("Added subscriber 3 using writer");
        };
        Runnable reader = () -> {
            for (int i=0;i<list.size();i++){
                System.out.println("Reader: "+list.get(i));
            }
        };
        new Thread(writer).start();
        new Thread(reader).start();
    }

}
