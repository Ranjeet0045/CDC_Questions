package Dynamic_programming;

import java.util.Arrays;

public class Combination_sum_4 {

    public static int find(int idx, int[] nums, int target, int[][] dp){
        if (target < 0) return 0;
        if (target == 0) return 1;
        if (idx < 0) return 0;

        if(dp[idx][target] != -1) return dp[idx][target];

        int pick = find(nums.length-1, nums, target - nums[idx], dp);
        int notPick = find(idx - 1, nums, target, dp);

        return dp[idx][target] = pick + notPick;
    }

    public static int combinationSum4(int[] nums, int target) {
        int[][] dp = new int[nums.length+1][target+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return find(nums.length-1, nums, target, dp);
    }

    public static int tabulation(int[] nums, int target){
        int[] dp = new int[target+1];
        dp[0] = 1;

        for(int i=1; i<=target; i++){
            for(int num : nums){
                if(i - num >= 0){
                    dp[i] += dp[i-num];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;
        int ans1 = combinationSum4(nums, target);
        System.out.println(ans1);
        
        int ans2 = tabulation(nums, target);
        System.out.println(ans2);
    }
}


