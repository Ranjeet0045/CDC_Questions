package Greedy;
import java.util.*;

public class Fractional_knapsack {

    public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Sort by ratio (value/weight) in descending order
        Arrays.sort(idx, (a, b) -> Double.compare((double)val[b] / wt[b], (double)val[a] / wt[a]));

        double totalValue = 0.0;

        for (int i : idx) {
            if (capacity == 0) break;

            if (wt[i] <= capacity) {
                totalValue += val[i];
                capacity -= wt[i];
            } 
            else {
                double fraction = (double) capacity / wt[i];
                totalValue += val[i] * fraction;
                capacity = 0;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;
        double ans = fractionalKnapsack(val, wt, capacity);
        System.out.println(ans);  // Expected output: 240.0
    }
}
