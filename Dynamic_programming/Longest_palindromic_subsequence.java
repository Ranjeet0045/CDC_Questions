package Dynamic_programming;

public class Longest_palindromic_subsequence {

    public static int solve(String s,int i,int j){
        if(i > j) return 0;

        if(i != j && s.charAt(i) == s.charAt(j)) return 2 + solve(s, i+1, j-1);
        if(i == j && s.charAt(i) == s.charAt(j)) return 1 + solve(s, i+1, j-1);

        return Math.max(solve(s, i+1, j),solve(s, i, j-1));
    }

    public static int longestPalindromeSubseq(String s) {
        return solve(s,0,s.length()-1);
    }

    public static void main(String[] args) {

        String s = "bbbab";
        int ans = longestPalindromeSubseq(s);
        System.out.println(ans);

    }
}
