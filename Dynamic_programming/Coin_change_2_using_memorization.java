package Dynamic_programming;

import java.util.Arrays;

public class Coin_change_2_using_memorization {

    public static int helper(int amount,int[] coins,int count,int idx,int[][] dp){
        if(amount == 0){
            return count + 1;
        }
        if(amount < 0 || idx >= coins.length){
            return 0;
        }
        if(dp[idx][amount] != -1) return dp[idx][amount];

        int pick = helper(amount-coins[idx], coins, count, idx,dp);
        int notPick = helper(amount, coins, count, idx+1,dp);

        dp[idx][amount] = pick + notPick;

        return dp[idx][amount];
    }

    public static int change(int amount, int[] coins) {
        int count = 0;
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0; i<coins.length; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = helper(amount,coins,count,0,dp);
        return ans;
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        int ans = change(amount,coins);
        System.out.println(ans);
    }
}
