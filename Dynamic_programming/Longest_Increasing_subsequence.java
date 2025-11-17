package Dynamic_programming;

import java.util.Arrays;

public class Longest_Increasing_subsequence {

    static int find(int idx, int[] arr, int lastIdx, int[][] dp){
        if(idx == arr.length){
            return 0;
        }

        if(dp[idx][lastIdx + 1] != -1) return dp[idx][lastIdx + 1];
        int pick = 0;
        if(lastIdx == -1 || arr[idx] > arr[lastIdx]){
            pick = 1 + find(idx+1, arr, idx, dp);
        }
        int notPick = find(idx+1, arr, lastIdx, dp);

        return dp[idx][lastIdx + 1] = Math.max(pick, notPick);
    }

    static int lis(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) Arrays.fill(row, -1);
        return find(0,arr,-1,dp);
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 7, 9, 1};
        int ans = lis(arr);
        System.out.println(ans);
    }
}
