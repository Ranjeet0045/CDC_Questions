package Array_Questions;

public class Remove_min_max_from_Array {
    public static int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        int n = nums.length;

        if(n == 1) return 1;

        for(int i=0; i<n; i++){
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int opt1 = right + 1; //From front
        int opt2 = n - left;  //From back
        int opt3 = (left + 1) + (n - right); //one from from and one from back

        return Math.min(opt1, Math.min(opt2, opt3));
    }
    public static void main(String[] args) {
        int[] nums = {2,10,7,5,4,1,8,6};
        int count = minimumDeletions(nums);
        System.out.println(count);
    }
}
