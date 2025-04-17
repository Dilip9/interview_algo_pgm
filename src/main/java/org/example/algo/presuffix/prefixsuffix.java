package org.example.algo.presuffix;

public class prefixsuffix {

    public static void main(String[] args) {
        String s  = "fixpreFixSuffix";
        String str = "abacaba";
        int result = longestPrefixSuffix(str);
        System.out.println("Longest prefix-suffix: " + result);
        longestNonPrefixSuffix(s);
    }
    public static String longestNonPrefixSuffix(String s){
        int n = s.length();
        for(int len = n/2; len>0;len--){
            String prefix = s.substring(0, len);
            String suffix = s.substring(n-len);
            if(!prefix.equals(suffix)){
                System.out.println("Longest non-prefix-suffix: " + prefix);
                return prefix;
            }
        }
        return "-1";
    }

    public static int longestPrefixSuffix(String s){
        int n = s.length();
       int[] lps = new int[n];
       int len =0;
       int i=1;
       while(i<n){
              if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
              }else{
                if(len != 0){
                     len = lps[len-1];
                }else{
                     lps[i] = 0;
                     i++;
                }
              }
       }
       System.out.println("Longest prefix-suffix: " + lps[n-1]);
       return lps[n-1];

    }


}
