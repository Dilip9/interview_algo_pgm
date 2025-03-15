package org.example.currentinterview;

import java.util.Arrays;
import java.util.stream.Stream;

public class TechMahindra {

    //private User user;

    public static void main(String[] args){

        int [] arr = {3,0,2,0,0,5,4,0,1,0};
        sortNumberwithaddingZeroAtLast(arr);
        // reverse String.
        String str = "Hello my dear";
        reverseString(str);
        reverseStringUsingStream(str);
        String strs = "Hello my dear";
        reverseStringWordsOnly(strs);
        String strsing = "Hello my dear daughter";
        Arrays.stream(strsing.split(" ")).map(s -> new StringBuffer(s).reverse()).forEach(ch -> System.out.printf("%s ",ch));

    }
    public static void sortNumberwithaddingZeroAtLast(int [] unsortedarr){
        int countNonZero=0;
        for(int i=0;i<unsortedarr.length;i++){
            if(unsortedarr[i] !=0){
                unsortedarr[countNonZero++] = unsortedarr[i];
            }
        }
        Arrays.sort(unsortedarr, 0, countNonZero);
        int totalzero = unsortedarr.length - countNonZero;
        for(int i=0;i<totalzero;i++){
            unsortedarr[countNonZero++] = 0;
        }
        Arrays.stream(unsortedarr).forEach(System.out::println);


    }

    public static void reverseString(String str){
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=ch.length-1;i>=0;i--){
           sb.append(ch[i]);
        }
        System.out.println(sb.toString());
    }
    public static void reverseStringUsingStream(String str){
        Stream.of(str).map(s -> new StringBuilder(s).reverse()).forEach(System.out::println);
    }

    public static void reverseStringWordsOnly(String str){
        String [] words = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i< words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                sb.append(words[i].charAt(j));
            }
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

}
