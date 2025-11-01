package Dynamic_programming;

public class House_Robber_using_tabulation {

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= n; i++) {
            int pick = nums[i - 1] + dp[i - 2]; // pick this house
            int notPick = dp[i - 1];            // skip this house

            dp[i] = Math.max(pick, notPick);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = rob(nums);
        System.out.println(ans);
    }
}
