package org.example.algo.search;

public class MajorityElement {
    public static void main(String[] args) {
        // Function to find the majority element
        // Using Moore's Voting Algorithm
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

}
