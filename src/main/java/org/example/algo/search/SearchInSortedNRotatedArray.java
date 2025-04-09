package org.example.algo.search;

public class SearchInSortedNRotatedArray {

    public static void main(String[] args) {
        int[] nums = {3,6,9,12,15,78,90, 1, 2,3};
        int target = 1;
        int position = positionBinarySearch(nums, target);
        System.out.println(position);
    }

    private static int positionBinarySearch(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid+1;
            if(nums[low] <= nums[mid]){
                if(nums[low] < target && nums[mid]>target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid] < target && nums[high] > target){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
