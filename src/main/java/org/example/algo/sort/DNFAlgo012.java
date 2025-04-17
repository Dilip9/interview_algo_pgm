package org.example.algo.sort;

import java.util.Arrays;

public class DNFAlgo012 {
    /**
     * Dutch National Flag Algorithms also known as 3 way portioning.
     * The Dutch National Flag Algorithm, also known as the 3-way partitioning algorithm, is used to sort an array containing three distinct values.
     * It was proposed by Edsger Dijkstra and is particularly useful for sorting arrays of 0s, 1s, and 2s.
     *
     * How It Works
     * The algorithm maintains three pointers:
     *      low: Points to the next position where a 0 should be placed.
     *      mid: Scans through the array.
     *      high: Points to the next position where a 2 should be placed.
     * The algorithm processes the array in a single pass (O(n) time complexity) with the following steps:
     *      1. Initialize low to 0, mid to 0, and high to the last index of the array.
     *      2. Traverse the array with the mid pointer:
     *          If the element at mid is 0, swap it with the element at low, and increment both low and mid.
     *          If the element at mid is 1, just move the mid pointer.
     *          If the element at mid is 2, swap it with the element at high, and decrement high.
     * */

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort012InAscendingOrder(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void sort012InAscendingOrder(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high--);
                    break;
            }
        }
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }


}
