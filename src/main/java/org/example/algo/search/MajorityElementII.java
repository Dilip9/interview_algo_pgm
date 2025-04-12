package org.example.algo.search;

public class MajorityElementII {
    public static void main(String[] args) {
        // Find majority elements in an array that appears more than n/3 times
        int[] nums = {3, 2, 3, 2, 2, 1, 1};
        int[] result = findMajorityElements(nums);
        for (int num : result) {
            System.out.println(num);
        }
    }
    public static int[] findMajorityElements(int[] nums) {
        int n = nums.length;
        if (n == 0) return new int[0];
        if(n == 1) return new int[]{nums[0]};
        if(n == 2) return new int[]{nums[0], nums[1]};

        int count1 = 0, count2 = 0, candidate1 = 0, candidate2 = 0;

        for (int num : nums) {
            if (num != 0 && num == candidate1) {
                count1++;
            } else if (num != 0 && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Verify the candidates
        count1 = 0; count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        // Collect results
        int[] result = new int[2];
        int index = 0;
        if (count1 > n / 3) result[index++] = candidate1;
        if (count2 > n / 3) result[index] = candidate2;

        return java.util.Arrays.copyOf(result, index);
    }
}
