package Bit_Manipulation;

import java.util.Arrays;

public class Counting_Bits {

    public static int[] countBits(int n) {
        int ans[]=new int[n+1];

        for(int i=1;i<=n;i++){
            ans[i]=ans[i & (i-1)]+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ans = countBits(n);
        System.out.println(Arrays.toString(ans));
    }
}
