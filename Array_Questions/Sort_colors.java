package Array_Questions;

import java.util.Arrays;

public class Sort_colors {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            switch (nums[mid]) {
                case 0 -> {
                    swap(low,mid,nums);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                default -> {
                    swap(mid,high,nums);
                    high--;
                }
            }
        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
