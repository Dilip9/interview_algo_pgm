package org.example.randonpgm;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int zeros=0, one=0, two=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==2){
                two++;
            }
        }
        for(int i=0;i<zeros; i++){
            arr[i] = 0;
        }
        for(int i=zeros; i<zeros+one; i++){
            arr[i] = 1;
        }
        for(int i=zeros+one;i<zeros+one+two; i++){
            arr[i] = 2;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
