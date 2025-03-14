package org.example.interviewedpgm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HCL {
    public static void main(String[] args){
        List<Integer> lst = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Optional<Integer> maximum = lst.stream().sorted((a,b) -> b-a).findFirst();
        Optional<Integer> minmum = lst.stream().sorted().findFirst();
        System.out.println(":::: maimum value "+maximum.get());
        System.out.println(":: Minimum :::: "+minmum.get());

        List<List<String>> nestedArray = Arrays.asList(Arrays.asList("Hero","MotorCoprs"),
                Arrays.asList("Apple","Banana"),
                Arrays.asList("Dog","Elephant"),
                Arrays.asList("Eat", "Drink"),
                Arrays.asList("Apple","Elephant"),
                Arrays.asList("Apple", "Drink"));
        //Use flatten array to convert it into normal array list.
        System.out.println(nestedArray.stream().flatMap(List::stream).collect(Collectors.joining(" ")));
        List<String> result = nestedArray.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("::::"+result.stream().filter(str ->startsWithVowels(str)).filter(str -> str.length()>=3).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        //Most occuring words in String array.
        String str = result.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        // Most occuring words in descending order.
        result.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2) ->Long.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> System.out.println("{ "+ entry.getKey() +" = "+entry.getValue()+" }"));
        System.out.println("::::::: Most occurence word in string array ::::: "+ str);
        System.out.println(result);
//        arr[] =
//        Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n=arr.length;
        int nonZeroNumber=0;
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                arr[nonZeroNumber++] = arr[i];
            }
        }
        Arrays.sort(arr, 0, nonZeroNumber);
        while(nonZeroNumber<n){
            arr[nonZeroNumber++] = 0;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
    private static boolean startsWithVowels(String str){
        return str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str
                .startsWith("o") || str.startsWith("u") || str.startsWith("A") || str.startsWith("E") || str.startsWith("I") || str
                .startsWith("O") || str.startsWith("U");
    }
}
