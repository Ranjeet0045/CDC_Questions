package Dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perfect_squares {

    public static int numSquares(int n) {
        
        List<Integer> list = new ArrayList<>();
        List<Integer> squares = squareList(n,list);
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return helper(squares, n, dp);
    }
    public static int helper(List<Integer> squares, int remaining, int[] dp) {

        if (remaining == 0) return 0; // no squares needed
        if (dp[remaining] != -1) return dp[remaining];

        int min = Integer.MAX_VALUE;

        for (int sq : squares) {
            if (sq > remaining) break;

            int res = helper(squares, remaining - sq, dp);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + res);
            }
        }

        dp[remaining] = min;
        return min;
    }
    public static List<Integer> squareList(int n,List<Integer> list){

        for(int i=1; i<=n; i++){
            int num = (int)(Math.sqrt(i));
            if(num*num == i){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 12;
        int ans = numSquares(n);
        System.out.println(ans);
    }
}
