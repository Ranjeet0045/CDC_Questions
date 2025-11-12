package Dynamic_programming;

public class Longest_palidnromic_substring {

    static int[][] t = new int[1001][1001];

    public static int solve(String str,int i,int j){
            if(i >= j){
                return 1;
            }
            if(t[i][j] != -1){
                return t[i][j];
            }
            if(str.charAt(i) == str.charAt(j)){
                return t[i][j] = solve(str, i + 1, j - 1);
            }
            return t[i][j] = 0;
        }

    public static String longestPalindrome(String s) {
        
        int n = s.length();
        
        int maxLen = Integer.MIN_VALUE;
        int sp = 0;

        // Initialize memoization table with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1;
            }
        }

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(solve(s,i,j) == 1){
                    if((j - i + 1) > maxLen){
                        maxLen = j-i+1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp,sp+maxLen);
    }

    public static void main(String[] args) {
        String s = "babad";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
