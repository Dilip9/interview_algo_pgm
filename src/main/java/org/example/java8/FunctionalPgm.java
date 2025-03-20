package org.example.java8;

import java.util.Arrays;

public class FunctionalPgm {

    public static void main(String[] args) {
        // HCL second round
        //BiFunctionalInterface biFunctionalInterface = (a, b) -> a + b;
        int num1=20,num2=30;
        int[] number = {678,345,756,890,2345,7543678,8690112,5467};
        SumofTwoNumber sumofTwoNumber = (a, b) -> a + b;
        System.out.println("Sum of two numbers: "+sumofTwoNumber.sum(num1,num2));

        //Reduce functional interface
        Arrays.stream(number).reduce(Integer::sum).ifPresent(System.out::println);
        Arrays.stream(number).reduce(Integer::max).ifPresent(System.out::println);
        Arrays.stream(number).reduce(Integer::min).ifPresent(System.out::println);
        //custom functional interface and reduce method.
        ReduceFunction<Integer> reduceFunction = (a, b) -> a + b;
        System.out.println("Sum of numbers: "+reduceFunction.apply(num1, num2));





    }
}

interface SumofTwoNumber{
    int sum(int a, int b);
}

@FunctionalInterface
interface ReduceFunction<T>{
    T apply(T t1, T t2);
}