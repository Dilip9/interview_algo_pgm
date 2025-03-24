package org.example.interviewedpgm;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgimin {
    public static void main(String[] args) {
        String str = "Java Programming Language";
//        str.replaceAll("\\s", "").chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().forEach(System.out::println);
        str.replaceAll("\\s", "").chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()  <= 1).forEach(map -> System.out.println("Non Duplicate ::"+map.getKey()));
    }
}
