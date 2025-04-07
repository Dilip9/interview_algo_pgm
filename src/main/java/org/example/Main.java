package org.example;

import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

    //Write a program which can take input as integer and give output as Binary format.
        //
        //E.g. Input : 15
        //
        //Output : 1111
        //
        //note : without using any predefined method
        //
        // 1. Take an integer input from the user

        //Implement the method int[] findSum(int[] arr, int n) that takes an integer array arr and returns an array containing two elements from arr that add up to n. If there are multiple valid pairs, return only one. If no such pair exists, return the original array.
        //Note:
        //
        //Do not use any predefined functions to find the pair.
        //
        //Example:
        //
        //Input: arr = [2, 7, 11, 15], n = 9
        //
        //Output: [2, 7]
        //HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {2, 7, 11, 15};
        int target = 17;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                    break;
                }
            }
//            int checkExisting = target - arr[i];
//            if(map.containsKey(checkExisting)){
//                System.out.println("Pair found: " + checkExisting + ", " + arr[i]);
//                break;
//            }
//            else{
//                map.put(arr[i],i);
//            }
        }
    }
}


