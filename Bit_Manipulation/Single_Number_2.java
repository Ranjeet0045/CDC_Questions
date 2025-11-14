package Bit_Manipulation;

import java.util.Arrays;

public class Single_Number_2 {

        public static int singleNumber(int[] nums) {
            Arrays.sort(nums);
            int ans = -1;
            int i = 0;
            int n = nums.length;
            if(n == 1){
                ans = nums[0];
                return ans;
            }
            else{
                while(i < n){
                if(nums[0] != nums[1]){
                    ans = nums[0];
                    return ans;
                }
                else if(nums[n-2] != nums[n-1]){
                    ans = nums[n-1]; 
                    return ans;
                }
                else if(nums[i] != nums[i+1] && nums[i+1] != nums[i+2]){
                    ans = nums[i+1];
                    return ans;
                }
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}
