package org.example.algo.search;

public class SearchFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {3,6,9,9,9,12,15,78,90};
        int target = 9;
        int [] result = positionOfFirstAndLast(nums, target);
        System.out.println("First Position: "+result[0]+" Last Position: "+result[1]);


    }

    private static int[] positionOfFirstAndLast(int[] nums, int target) {
        int last = findFirstElementPosition(nums, target);
        int first = findLastElementPosition(nums, target);
        return new int[]{first,last};
    }

    private static int findLastElementPosition(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int start =-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                start = mid;
                high = mid-1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return start;
        //return 8;
    }

    private static int findFirstElementPosition(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) {
                //System.out.println(" Found target element last position: " + mid+1);
                last = mid;
                low = mid+1;

            } else if (nums[mid] < target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return last;
    }


}
