package Greedy;

public class Jump_Game_2 {

    public static int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int jumps = 0;
        int maxReach = nums[0];
        int steps = nums[0];

        for(int i=1; i<n-1; i++){
            maxReach = Math.max(maxReach,i + nums[i]);
            steps--;

            if(steps == 0){
                jumps++;
                steps = maxReach - i;
            }
        }

        return jumps+1;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int ans = jump(nums);
        System.out.println(ans);
    }
}
