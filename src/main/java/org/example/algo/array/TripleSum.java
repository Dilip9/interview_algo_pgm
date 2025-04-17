package org.example.algo.array;

import java.util.Arrays;
import java.util.HashMap;

public class TripleSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45,12,72,98,100,23,57};
        int target = 103;
        int n = arr.length;
        int[] result = findTriplet(arr, n, target);
        Arrays.stream(result).forEach(System.out::println); // Print the result

        int[] resultON = findTripletWIthON(arr, n, target);
        Arrays.stream(resultON).forEach(System.out::println); // Print the result

    }
    // 2nd Approach
    public static int[] findTriplet(int[] arr, int lngth, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<lngth;i++){
            for(int j=i+1;j<lngth;j++){
                int sum = arr[i] + arr[j];
                int diff = target - sum;
                if(map.containsKey(diff)){
                    return new int[]{arr[i], arr[j], diff};
                }else{
                    map.put(arr[j], j);
                }
            }
        }
        return new int[]{-1, -1, -1}; // Return -1 if no triplet is found
    }

    // 3rd approach O(n) time timecomplexitiy.
    public static int[] findTripletWIthON(int[] arr, int n, int target){
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target){
                    return new int[]{arr[i], arr[left], arr[right]};
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new int[]{-1, -1, -1}; // Return -1 if no triplet is found

    }

}


