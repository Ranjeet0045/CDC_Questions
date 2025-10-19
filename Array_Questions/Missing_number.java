package Array_Questions;

public class Missing_number {

    public static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
}
