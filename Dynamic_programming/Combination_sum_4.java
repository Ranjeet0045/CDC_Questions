package Dynamic_programming;

import java.util.Arrays;

public class Combination_sum_4 {

    public static int find(int idx, int[] nums, int target, int[][] dp){
        if (target < 0) return 0;
        if (target == 0) return 1;
        if (idx >= nums.length) return 0;

        if(dp[idx][target] != -1) return dp[idx][target];

        int pick = find(0, nums, target - nums[idx], dp);
        int notPick = find(idx + 1, nums, target, dp);

        return dp[idx][target] = pick + notPick;
    }

    public static int combinationSum4(int[] nums, int target) {
        int[][] dp = new int[nums.length+1][target+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return find(0, nums, target, dp);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;
        int ans = combinationSum4(nums, target);
        System.out.println(ans);
    }
}


