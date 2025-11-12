package Dynamic_programming;

public class Shortest_common_superSequence {

    public static String shortestCommonSupersequence(String X, String Y) {
        int n = X.length(), m = Y.length();
        int[][] dp = computeLCS(X, Y);

        int i = n, j = m;
        StringBuilder scs = new StringBuilder();

        // Backtrack from dp[n][m]
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                scs.append(X.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                scs.append(X.charAt(i - 1));
                i--;
            } else {
                scs.append(Y.charAt(j - 1));
                j--;
            }
        }

        // Add remaining characters
        while (i > 0) scs.append(X.charAt(--i));
        while (j > 0) scs.append(Y.charAt(--j));

        return scs.reverse().toString(); // reverse since we built it backwards
    }

    private static int[][] computeLCS(String X, String Y) {
        int n = X.length(), m = Y.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        String str1 = "abac", str2 = "cab";
        String ans = shortestCommonSupersequence(str1, str2);
        System.out.println(ans);
    }
}
