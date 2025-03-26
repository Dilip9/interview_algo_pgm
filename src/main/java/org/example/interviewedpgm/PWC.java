package org.example.interviewedpgm;

import java.util.Arrays;

public class PWC {
    // given input : int[] arr = {1,2,3,4,5,6,7,8,9,10};
    // output: {2,4,6,8,10,1,3,5,7,9};
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //output: {2,4,6,8,10,1,3,5,7,9};
        // Using two pointer approach with constant space no extra memory space should be used.
        // arrange without maintining order of even and odd but even is coming as earlier
        evenOddArrangement(arr);
        //Insert order must be preserved.
        evenOddArramgementOderPreserved(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void evenOddArramgementOderPreserved(int[] arr) {

    }

    public static void evenOddArrangement(int[] arr){
        int left=0, right=0;
        while(right<arr.length){
            if(arr[right] % 2 ==0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
            right++;
        }
    }
}
