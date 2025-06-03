package org.example.interviewedpgm;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgimin {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        str.replaceAll("\\s", "").chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue()  <= 1)
                .forEach(map -> System.out.println("Non Duplicate ::"+map.getKey()));
        // find second duplicate character
        String data = "How are you doing dilip";
        data.replaceAll("\\s+", "").chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .skip(1)
                .findFirst()
                .ifPresent(map -> System.out.println("Second Duplicate Character ::" + map.getKey()));


        int[] lstdata = {1,42,1,65,76,345,32,356,23,653,89,45,76,23,65,32,1,42,1,65,76,345,32,356,23,653,89};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int n : lstdata){
            if(n> max){
                secondMax = max;
                max = n;
            }
            else if (n> secondMax && n < max) {
                secondMax = n;
            }
        }
        System.out.println("Second Max ::" + secondMax);
    }
}
