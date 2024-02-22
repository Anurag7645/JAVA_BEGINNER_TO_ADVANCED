package GFG_POTD;

import java.util.Arrays;

public class Distinct_Occurences {
    private static final int MOD = 1000000007;

    private int solve(String s, String t, int i, int j, int[][] dp) {
        if (t.length() == j) return 1;
        if (s.length() == i) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = (solve(s, t, i + 1, j + 1, dp) % MOD + solve(s, t, i + 1, j, dp) % MOD) % MOD;
        } else {
            dp[i][j] = solve(s, t, i + 1, j, dp) % MOD;
        }
        return dp[i][j];
    }

    public int subsequenceCount(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(s, t, 0, 0, dp) % MOD;
    }
}
