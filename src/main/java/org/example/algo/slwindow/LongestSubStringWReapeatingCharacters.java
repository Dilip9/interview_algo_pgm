package org.example.algo.slwindow;

import java.util.HashSet;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubStringWReapeatingCharacters {
    //EPAM interview Questions for second round.
    // Given a string s, find the length of the longest substring without repeating characters.
    // Input: s = "abcabcbb"
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int n = s.length();
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }

        }
        return maxLength;
    }
}
