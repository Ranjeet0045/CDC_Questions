package Dynamic_programming;

import java.util.Arrays;

public class Target_sum_using_memorization {

    public static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int maxSum = 0;
        for (int num : nums) maxSum += num;

        // dp[idx][sum + maxSum]
        int[][] dp = new int[n][2 * maxSum + 1];
        for (int[] row : dp) Arrays.fill(row, Integer.MIN_VALUE);

        return helper(nums, target, 0, 0, dp, maxSum);
    }

    public static int helper(int[] nums, int target, int idx, int sum, int[][] dp, int offset) {
        if (idx == nums.length) {
            return (sum == target) ? 1 : 0;
        }

        if (dp[idx][sum + offset] != Integer.MIN_VALUE) {
            return dp[idx][sum + offset];
        }

        int plus = helper(nums, target, idx + 1, sum + nums[idx], dp, offset);
        int minus = helper(nums, target, idx + 1, sum - nums[idx], dp, offset);

        dp[idx][sum + offset] = plus + minus;
        return dp[idx][sum + offset];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int ans = findTargetSumWays(nums,target);
        System.out.println(ans); // 5
    }
}
