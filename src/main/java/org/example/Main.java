package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

//Exectuor service for two thread.
public class Main {


    public static void main(String[] args) {

//        executorService.submit(() -> System.out.println("Hello"));
//        executorService.shutdown();



        String str = "I Love Java programming";
        str.replaceAll("\\s","").chars()
                .mapToObj(ch ->(char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(ch -> ch.getValue()>1)
                .forEach((k) -> System.out.println("key "+k.getKey()+ " value : "+k.getValue()));
        //SQL Queries.
//        Find 3rd max salary from employee table?
        //select salary from employee order by salary dec limit 2 offset 1;
       // select max(Salary) from employee < (select max(Salary) from employee );


    }
}
