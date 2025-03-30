package org.example.algo.search;

public class SearchFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {3,6,9,9,9,12,15,78,90};
        int target = 15;
        int [] result = positionOfFirstAndLast(nums, target);


    }

    private static int[] positionOfFirstAndLast(int[] nums, int target) {
        int first = findFirstElementPosition(nums, target);
        int last = findLastElementPosition(nums, target);
        return new int[]{first,last};
    }

    private static int findLastElementPosition(int[] nums, int target) {
    }

    private static int findFirstElementPosition(int[] nums, int target) {
    }


}
