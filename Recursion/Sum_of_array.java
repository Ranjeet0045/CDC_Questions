package Recursion;

public class Sum_of_array {
    
    public static long sumArray(int[] arr) {
        long s = 0;
        for (int v: arr) s += v;
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Sum of array = " + sumArray(arr));
    }
}
