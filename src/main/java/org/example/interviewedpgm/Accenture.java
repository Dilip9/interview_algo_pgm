package org.example.interviewedpgm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accenture {


//    List names = Arrays.asList("Charlie", "Alice", "Bob");
//names.stream().sort().forEach(System.out::println());
//
//    to print distinct elements from a list of integers.
//    streams
//    List names = Arrays.asList("Charlie", "Alice", "Bob");
//    to print names sorted in alphabetical order from a list.
//    Write a Java 8 program to find and print the first element in sorted order.
//    import java.util.Arrays;
//    List numbers = Arrays.asList(5, 3, 1, 4, 2);
//    a has run
//    b has run
//    c has one run
//    b extends a
//    c extend b
//    which method will execute
//    String s1 = "abc"
//    String s2 = new String "abc"
//    s1 == s2 is it true or false ?  Ans: false
//    s1.equals(s2) is it true or false   Ans: true
//    hashmap collision
//    Design Pattern
//    bank class having his own rate of interest
//
//            RBI - his own interest
//
//    ICICI bank , HDFC bank, SBI --- their own interest rate

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        List<Integer> numbers = Arrays.asList(1, 2,9, 10, 3, 4, 4);
        numbers.stream().distinct().forEach(System.out::println);
        int number = numbers.stream().sorted().findFirst().get();
        System.out.println("First Number : "+number);
        int thrirdNumber = numbers.stream().sorted((a,b) -> b - a).skip(numbers.size()-3).findFirst().get();
        System.out.println(" Third heigest number :"+thrirdNumber);
        List<String> strNames = Arrays.asList("Charlie", "Alice", "Bob");
        strNames.stream().sorted().forEach(System.out::println);
    }
}
