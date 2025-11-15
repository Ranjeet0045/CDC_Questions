package Greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Max_chunks_to_make_sorted_2 {

    //Approach-1
    public static int maxChunksToSorted_approach_1(int[] arr) {
        int n = arr.length;
        int count = 0;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        int max = arr[0];
        prefixMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            prefixMax[i] = max;
        }

        int min = arr[n - 1];
        suffixMin[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            suffixMin[i] = min;
        }

        for (int i = 0; i < n - 1; i++) {
            if (prefixMax[i] <= suffixMin[i + 1]) {
                count++;
            }
        }

        return count + 1;
    }

    //Approach-2
    public static int maxChunksToSorted_approach_2(int[] arr){
        int n = arr.length;

        int[] temp = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Queue<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(temp[i], k -> new LinkedList<>()).add(i);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]).poll();
        }

        int count = 0;
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < ans.length; i++) {
            maxEle = Math.max(maxEle, ans[i]);
            if (maxEle == i) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,4};
        int ans1 = maxChunksToSorted_approach_1(arr);
        System.out.println(ans1);
        int ans2 = maxChunksToSorted_approach_2(arr);
        System.out.println(ans2);
    }
}
