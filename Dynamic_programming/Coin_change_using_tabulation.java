package Dynamic_programming;

import java.util.Arrays;

public class Coin_change_using_tabulation {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        
        dp[0] = 0;
        for(int coin : coins){
            for(int a = coin; a<= amount; a++){
                dp[a] = Math.min(dp[a],dp[a-coin]+1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        int ans = coinChange(coins,amount);
        System.out.println(ans);
    }
}
