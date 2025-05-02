package org.example.interviewedpgm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Publicius {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 4;
        closetoTarget(arr, n);
        String[] str = {"rtyiulhggwstrgcfhvm", "Areyouworkingfor", "Have you worked together", "HelloWorld", "linkedIn"};
        findCharacter(str, 'o');
        //count y character in given string array.
        String[] str1 = {"rtyiulhggwstrgcfhvm", "Areyouworkingfor", "Have you worked together", "HelloWorld", "linkedIn"};
        long count = Arrays.stream(str1).flatMap(s -> Arrays.stream(s.split(""))).filter(s -> s.equals("y")).count();
        System.out.println("Total Count of character in string array.. "+ count);
        String text = "Howareyoudoingmrdilip";
        Optional<Character> nonRepeatingCharacter = text.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(chr -> chr.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();
        nonRepeatingCharacter.ifPresent(System.out::println);
        nonRepeatingCharacter.ifPresentOrElse(System.out::println, () -> {
            System.out.println("No character found.");
        });
    }
    public static void closetoTarget(int[] arr, int target){
        Arrays.stream(arr).boxed().filter(i -> i<target).min(Comparator.comparingInt(i -> Math.abs(i - target)))
                .ifPresentOrElse(System.out::println, () -> System.out.println("No such number"));
    }

    public static void findCharacter(String[] str, char c){
        Arrays.stream(str).filter(s -> s.indexOf(c) != -1).forEach(System.out::println);
    }


}
