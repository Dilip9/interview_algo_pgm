package org.example.algo.sort;

import java.util.Arrays;

public class QuickSortAlgo {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quickSorts(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void quickSorts(int[] arr, int low, int high) {
        if(low<high){
            int pivotIndex = partitionArray(arr, low, high);
            quickSorts(arr, low, pivotIndex-1);
            quickSorts(arr, pivotIndex+1, high);
        }
    }
    public static int partitionArray(int[] arr, int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j] >= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    private static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
