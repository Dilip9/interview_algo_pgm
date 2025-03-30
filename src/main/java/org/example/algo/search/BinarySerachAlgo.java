package org.example.algo.search;

public class BinarySerachAlgo {
    public static void main(String[] args) {
        int[] nums = {3,6,9,12,15,78,90};
        int target = 15;
        binarySearch(nums, target);
    }
    public static void binarySearch(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                System.out.println(" Found target element. " + target);
                return ;
            } else if (nums[mid] <= target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}
