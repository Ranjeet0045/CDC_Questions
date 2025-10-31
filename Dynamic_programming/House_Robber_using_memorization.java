package Dynamic_programming;

import java.util.Arrays;

public class House_Robber_using_memorization {

    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    public static int helper(int[] nums, int idx, int[] dp) {
        if (idx >= nums.length) {
            return 0;
        }
        if (dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + helper(nums, idx + 2, dp);
        int notPick = helper(nums, idx + 1, dp);

        dp[idx] = Math.max(pick, notPick);
        return dp[idx];
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 1, 10};

        int ans = rob(nums);
        System.out.println(ans);
    }
}
