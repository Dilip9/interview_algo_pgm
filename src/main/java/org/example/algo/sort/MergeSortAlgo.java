package org.example.algo.sort;

import java.util.Arrays;

public class MergeSortAlgo {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        int low = 0;
        mergeSorting(arr, low, n - 1);
        Arrays.stream(arr).boxed().forEach(x -> System.out.printf("%d ", x));
    }

    public static void mergeSorting(int[] arr, int low, int high) {
        if(low<high){
            int mid = (low+high)/2;
            mergeSorting(arr, low, mid);
            mergeSorting(arr, mid+1, high);
            mergeArrayInSortingOrder(arr, low, mid, high);
        }
    }

    public static void mergeArrayInSortingOrder(int[] arr, int low, int mid, int high){
        int[] left = new int[mid-low+1];
        int[] right = new int[high-mid];
        // add all the left side of data into left array.
        for(int i=0;i<left.length;i++){
            left[i] = arr[low+i];
        }
        // add all the right side of data into right array.
        for(int j=0;j<right.length;j++){
            right[j] = arr[mid+1+j];
        }
        int i=0, j=0, k=low;
        while(i<left.length && j<right.length){
            if(left[i]>=right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }
    }

}
