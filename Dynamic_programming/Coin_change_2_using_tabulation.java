package Dynamic_programming;

public class Coin_change_2_using_tabulation {

    public static int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int i=0; i<n; i++){
            dp[i][0] = 1;
        }

        for(int i=n-1; i>=0; i--){
            for(int j=1; j<=amount; j++){

                int notPick = dp[i+1][j];
                int pick = 0;
                
                if(coins[i] <= j){
                    pick = dp[i][j-coins[i]];
                }
                dp[i][j] = pick + notPick;
            }
        }

        return dp[0][amount];
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        int ans = change(amount,coins);
        System.out.println(ans);
    }
}
