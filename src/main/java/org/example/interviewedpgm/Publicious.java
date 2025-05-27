package org.example.interviewedpgm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Publicious {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("listen", "silent", "enlist", "inlets", "google", "glooge");
        System.out.println("Anagrams: " + findAnagrams(list));
        String st1 = "listen";
        String st2 = "silentt";
        System.out.println(anagramString(st1, st2));
        System.out.println("Are " + st1 + " and " + st2 + " anagrams? " + areAnagrams(st1, st2));
        String lCSubstring = "aaabbbbbccccaaabbaabbbbbb";
        lCSubstring.chars()
                .mapToObj(c -> c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().max(Comparator.comparingInt(e -> e.getValue().intValue())).ifPresentOrElse((k) ->
                                System.out.println("Longest uniform subsequence: " + k.getKey() + " with length: " + k.getValue()),
                                () -> System.out.println("No uniform subsequence found"));

        System.out.println("Longest common substring: " + longestCommonSubstring(lCSubstring));
        Map.Entry<Character, Long> result = lCSubstring.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (result != null) {
            char character = result.getKey();
            long count = result.getValue();
            System.out.println("Longest uniform subsequence: " + String.valueOf(character).repeat((int) count));
            System.out.println("Length: " + count);
        }
    }


    private static String findAnagrams(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String str : list) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (list.stream().filter(s -> !s.equals(str)).anyMatch(s -> {
                char[] otherChars = s.toCharArray();
                Arrays.sort(otherChars);
                return sortedStr.equals(new String(otherChars));
            })) {
                result.append(str).append(" ");
            }
        }
        return result.toString().trim();
    }
    private static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
    private static boolean anagramString(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c: str2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }else{
                map.put(c,map.getOrDefault(c, 0)-1 );
            }
        }
        int size = map.size();
        System.out.println("size: " + size);
        for(char c: map.keySet()){
            if(map.get(c) != 0){
                return false;
            }
        }
        return true;
    }

    private static int longestCommonSubstring(String str){

       HashSet<Character> charSet = new HashSet<>();
        int maxLength = 1;
        int currentLength=1;
        if(str.length()==0){ return 0;}
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                currentLength++;
            }else{
                charSet.add(str.charAt(i-1));
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        return maxLength;

    }
}
