package org.example;//package org.example;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        String str = "coodinng";
        str.chars().mapToObj(ch -> ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted()
                .forEach((entries) ->System.out.println("Key :"+entries.getKey()+" Value :"+entries.getValue()));
    }
}

