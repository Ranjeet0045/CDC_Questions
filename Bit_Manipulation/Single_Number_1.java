package Bit_Manipulation;

public class Single_Number_1 {

    public static int singleNumber(int[] nums) {
       int unique = 0;
       for(int n : nums){
        unique ^= n;
       }
       return unique;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}
