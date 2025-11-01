package Dynamic_programming;

import java.util.Arrays;

public class House_Robber_2_using_memorization {

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        if(nums.length == 1) return nums[0];

        int ans1 = helper1(nums,0,dp1);
        int ans2 = helper2(nums,1,dp2);

        return Math.max(ans1,ans2);
    }
    public static int helper1(int[] nums,int idx,int[] dp){
        if(idx >= nums.length-1){
            return 0;
        }
        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + helper1(nums, idx + 2, dp);
        int notPick = helper1(nums, idx + 1, dp);

        dp[idx] = Math.max(pick,notPick);

        return dp[idx];
    }

    public static int helper2(int[] nums,int idx,int[] dp){
        if(idx >= nums.length){
            return 0;
        }
        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + helper2(nums, idx + 2, dp);
        int notPick = helper2(nums, idx + 1, dp);

        dp[idx] = Math.max(pick,notPick);

        return dp[idx];
    }
    public static void main(String[] args) {
        int[] nums = {200,3,140,20,10};
        int ans = rob(nums);
        System.out.println(ans);
    }
}
