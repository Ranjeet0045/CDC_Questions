package Dynamic_programming;

import java.util.Arrays;

public class Knapsack_problem {

    public static int find(int W, int[] val, int[] wt, int idx, int[][] dp) {

        if (W <= 0 || idx >= wt.length) {
            return 0;
        }
        if (dp[idx][W] != -1) return dp[idx][W];

        int pick = 0;
        if (wt[idx] <= W){
            pick = val[idx] + find(W - wt[idx], val, wt, idx + 1, dp);
        }
        int notPick = find(W, val, wt, idx + 1, dp);

        return dp[idx][W] = Math.max(pick, notPick);
    }

    public static int knapsack(int W, int[] val, int[] wt) {
        int[][] dp = new int[val.length][W + 1];

        for (int i = 0; i < val.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return find(W, val, wt, 0, dp);
    }

    public static void main(String[] args) {
        int W = 5;
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 2, 3};

        int ans = knapsack(W, val, wt);
        System.out.println(ans);
    }
}
