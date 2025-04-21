package org.example.interviewedpgm;

import java.util.HashSet;

public class Epam {
    public static void main(String[] args) {
        String s = "abcabcabd"; // O/P: 4
        int n = s.length();
        int left=0, right = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(right<n){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(max);
    }
}
