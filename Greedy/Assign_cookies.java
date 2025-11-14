package Greedy;

import java.util.Arrays;

public class Assign_cookies {

    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int i = 0;
        int j = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};
        int ans = findContentChildren(g,s);
        System.out.println(ans);
    }
}
