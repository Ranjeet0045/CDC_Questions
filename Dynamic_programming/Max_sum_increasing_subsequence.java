package Dynamic_programming;

import java.util.Arrays;

public class Max_sum_increasing_subsequence {

    public static int find(int[] arr, int idx, int lastIdx, int[][] dp) {
        if (idx == arr.length) return 0;

        if (dp[idx][lastIdx + 1] != -1) return dp[idx][lastIdx + 1];

        int pick = 0;
        if (lastIdx == -1 || arr[idx] > arr[lastIdx]) {
            pick = arr[idx] + find(arr, idx + 1, idx, dp);
        }

        int notPick = find(arr, idx + 1, lastIdx, dp);

        return dp[idx][lastIdx + 1] = Math.max(pick, notPick);
    }

    public static int maxSumIS(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return find(arr, 0, -1, dp);
    }

    public static void main(String[] args) {
        int arr[] = {1, 101, 2, 3, 100};
        int ans = maxSumIS(arr);
        System.out.println(ans);
    }
}
