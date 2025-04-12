package org.example;

import java.util.HashMap;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
    //Write a Java program to find all numbers in an integer array that satisfy the following conditions:
        //The immediate left neighbor of the number is smaller.
        //The immediate right neighbor of the number is greater.
        //For example, given the array {1, 3, 3, 6, 6, 7, 9, 0}, identify and print all such numbers.
        //output should be:- 7
        //
        int[] arr = {1, 3, 3, 6, 6, 7, 9, 0};
        //Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]> arr[i-1] && arr[i] < arr[i+1]){
                //stack.push(arr[i]);
                System.out.println(arr[i]);
            }
        }
    }
}


