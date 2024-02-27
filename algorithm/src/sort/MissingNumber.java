package sort;

import java.util.Arrays;

/**
 *
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Example 1:
 *
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 * 2 is the missing number in the range since it does not appear in nums.
 */

public class MissingNumber {

    public static void main(String args[]) {
        int[] nums = {3,0,1};
        System.out.println("Missing number: "+missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        // The missing number is the difference between the expected sum and the actual sum;
        int n = nums.length;
        int expectedSum = n*(n+1)/2;

        int actualSum = 0;
        for(int i =0;i<n;i++) {
            actualSum += nums[i];
        }
        return expectedSum-actualSum;
    }
}
