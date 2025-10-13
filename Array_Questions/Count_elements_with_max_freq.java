package Array_Questions;

public class Count_elements_with_max_freq {

    public static int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];

        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            arr[n] = arr[n] + 1;
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(max == arr[i]){
                count += arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        int ans = maxFrequencyElements(nums);
        System.out.println(ans);
    }
}
