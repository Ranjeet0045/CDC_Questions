package Dynamic_programming;

public class Palindromic_substring {

    public static int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        // i goes backward because dp[i+1][j-1] must be known already
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    // Length 1 (i == j) OR length 2 (j - i == 1)
                    if (j - i <= 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abc";
        int ans = countSubstrings(s);
        System.out.println(ans);
    }
}
