package Array_Questions;

public class Container_with_most_water {

    public static int maxArea(int[] arr) {
        int max = -1;
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int k = Math.min(arr[i],arr[j]);
            if(k*(j-i) > max){
                max = k*(j-i);
            }
            if(arr[i] < arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println(ans);
    }
}
