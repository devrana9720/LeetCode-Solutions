class Solution {
    Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return solve(s, p, 0, 0);
    }

    private boolean solve(String s, String p, int i, int j) {

        // Pattern completely processed
        if (j == p.length()) {
            return i == s.length();
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        boolean match = i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        boolean ans;

        // Next character is '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Case 1: Use '*' for zero occurrences
            boolean skip = solve(s, p, i, j + 2);

            // Case 2: Use '*' for one or more occurrences
            boolean take = match && solve(s, p, i + 1, j);

            ans = skip || take;

        } else {
            // Normal character or '.'
            ans = match && solve(s, p, i + 1, j + 1);
        }

        return dp[i][j] = ans;
    }
}