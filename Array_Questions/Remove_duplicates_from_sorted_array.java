package Array_Questions;

public class Remove_duplicates_from_sorted_array{

    public static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
}