package Greedy;

public class Max_chunks_to_make_sorted {

    public static int maxChunksToSorted(int[] arr) {
        int count = 0;
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxEle = Math.max(maxEle, arr[i]);
            if (maxEle == i) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4};
        int ans = maxChunksToSorted(arr);
        System.out.println(ans);
    }
}
