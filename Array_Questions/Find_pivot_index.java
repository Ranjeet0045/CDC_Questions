package Array_Questions;

public class Find_pivot_index {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + nums[i];
        }

        for(int i=0; i<n; i++){
            if(arr[i] == arr[n-1] - arr[i] + nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int ans = pivotIndex(nums);
        System.out.println(ans);
    }
}
