package org.example.interviewedpgm;

import java.util.Scanner;

public class Micro1AIInterview {
    // input str = "abc#d#e"
    // output = "abe";
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String which consists # included : ");
        String str = scn.nextLine();
        System.out.println("Output String : " + removeHashFromString(str));
    }
    public static String removeHashFromString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '#'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
