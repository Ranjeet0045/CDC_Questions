import java.util.Arrays;

public class Sliding_window_maximum{

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] output = new int[n - k + 1];

        // Build leftMax
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                leftMax[i] = nums[i]; // block start
            } else {
                leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
            }
        }

        // Build rightMax
        for (int i = n - 1; i >= 0; i--) {
            if ((i + 1) % k == 0 || i == n - 1) {
                rightMax[i] = nums[i]; // block end
            } else {
                rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
            }
        }

        // Build output
        for (int i = 0; i <= n - k; i++) {
            output[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] ans = maxSlidingWindow(nums,k);
        System.out.println(Arrays.toString(ans));
    }
}