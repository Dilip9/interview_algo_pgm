package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello my dear";
        reverseString(str);
        int[] arr = {34,62,43,65,23,546,76,23,65,132,546,576,86,435,3,53546,567,6,86,7,45,3,535,34,6,547,56,7,5,745,534,5,35};
        mergeSort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);
        quickSort(arr, arr.length);
    }

    private static void reverseString(String str) {

        char[] chr = str.replace(" ","").toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i= chr.length-1;i>=0;i--){
            sb.append(chr[i]);
        }
        System.out.println(sb.toString()); // raedymolleH
    }


    private static void quickSort(int[] arr, int length) {

    }

    private static void mergeSort(int[] arr, int n) {
        if (n <= 1) return;
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        for(int i=0;i<mid;i++){
            l[i] = arr[i];
        }
        for(int j=mid;j<n;j++){
            r[j-mid]= arr[j];
        }
        mergeSort(l, l.length);
        mergeSort(r, r.length);
        mergeArray(arr, l, r, mid, n-mid);


    }

    private static void mergeArray(int[] arr, int[] l, int[] r, int left, int right ) {
        int i=0, j=0, k=0;
        while(i<left && j<right){
            if(l[i]<= r[j]){
                arr[k++] = l[i++];
            }else{
                arr[k++] = r[j++];
            }
        }
        while(i<left){
            arr[k++] = l[i++];
        }
        while(j<right){
            arr[k++] = r[j++];
        }
    }
}