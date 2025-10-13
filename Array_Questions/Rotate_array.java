package Array_Questions;

import java.util.Arrays;

public class Rotate_array {
    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        k = k % n;
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j] = nums[i];
            j++;
        }

        for (int i = 0; i < n - k; i++) {
            ans[j] = nums[i];
            j++;
        }

        // Copy ans[] back into nums[]
        // for (int i = 0; i < n; i++) {
        //     nums[i] = ans[i];
        // }
        System.arraycopy(ans, 0, nums, 0, n);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
