package Dynamic_programming;

import java.util.Arrays;

public class Coin_change_2_using_tabulation {

    public static int change(int amount, int[] coins) {
        int[] dp = new int[coins.length];
        Arrays.fill(dp,-1);

        return dp[amount];
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        int ans = change(amount,coins);
        System.out.println(ans);
    }
}
