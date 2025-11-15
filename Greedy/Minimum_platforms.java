package Greedy;

import java.util.Arrays;

public class Minimum_platforms {

    public static int minPlatform(int arr[], int dep[]) {
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0;
        int j = 0;
        int needed = 0;
        int maxNeeded = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                needed++;
                maxNeeded = Math.max(maxNeeded, needed);
                i++;
            } 
            else {
                needed--;
                j++;
            }
        }

        return maxNeeded;
    }

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800}, dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int ans = minPlatform(arr, dep);
        System.out.println(ans);
    }
}
