package Dynamic_programming;
import java.util.*;

public class Coin_Change_using_memorization {

    public static int coinChange(int[] coins, int amount) {
        int count = 0;
        Arrays.sort(coins);
        int[][] memo = new int[coins.length][amount + 1];
        for (int[] row : memo)
            Arrays.fill(row, -1);

        int ans = helper(coins, amount, count, 0, memo);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static int helper(int[] coins, int amount, int count, int idx, int[][] memo) {
        if (amount < 0)
            return Integer.MAX_VALUE;

        if (idx == coins.length)
            return amount == 0 ? count : Integer.MAX_VALUE;

        if (memo[idx][amount] != -1)
            return memo[idx][amount] == Integer.MAX_VALUE ? Integer.MAX_VALUE : memo[idx][amount] + count;

        int pick = helper(coins, amount - coins[idx], count + 1, idx, memo);
        int notPick = helper(coins, amount, count, idx + 1, memo);

        int min = Math.min(pick, notPick);
        memo[idx][amount] = (min == Integer.MAX_VALUE ? Integer.MAX_VALUE : min - count);

        return min;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = coinChange(coins, amount);
        System.out.println(ans);
    }
}
