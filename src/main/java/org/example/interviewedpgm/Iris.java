package org.example.interviewedpgm;

import java.util.*;

public class Iris {

    //output: 2,6,8,-1,2,7,-1,9,4,5
    public static void main(String[] args) {
        int[] num = {1, 2, 6, 8, 2, 7, 3, 9, 4, 5};
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = testTwoStringIsAnagram(s1, s2);
        System.out.println(testAnaGram(s1, s2));
        System.out.println(isAnagram);
        int[] result = printNextGreaterElement(num);
        System.out.println("::"+ Arrays.toString(result));
    }
    public static int[] printNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static boolean testTwoStringIsAnagram(String s1, String s2){
        char[] chr1 = s1.toCharArray();
        Arrays.sort(chr1);
        char[] chr2 = s2.toCharArray();
        Arrays.sort(chr2);
        return Arrays.equals(chr1, chr2);
    }
    public static boolean testAnaGram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char ch : s1.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        for(char ch : s2.toCharArray()){
            if(!freqMap.containsKey(ch) || freqMap.get(ch) == 0) return false;
            freqMap.put(ch, freqMap.get(ch) - 1);
        }
        return true;
    }
}
