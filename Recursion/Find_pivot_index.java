package Recursion;

public class Find_pivot_index {
    
    public static int pivotIndex(int[] arr) {
        long total = 0;
        for (int v: arr) total += v;
        long leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            long rightSum = total - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index = " + pivotIndex(arr));
    }
}
