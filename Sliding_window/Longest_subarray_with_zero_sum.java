import java.util.HashMap;

public class Longest_subarray_with_zero_sum {

    public static int maxLength(int[] arr) {
        int maxSize = 0;
        int n = arr.length;
        int prefixSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i<n; i++){
            prefixSum  += arr[i];

            if(map.containsKey(prefixSum)){
                int idx = map.get(prefixSum);
                maxSize = Math.max(maxSize,i - idx);
            }
            else{
                map.put(prefixSum,i);
            }
        }

        return maxSize;
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int ans = maxLength(arr);
        System.out.println(ans);
    }
}
