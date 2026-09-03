class Solution {
    int dp[];
    private int solve(int i, String s, int n) {
        if (dp[i] != -1)
            return dp[i];
        if (i == n)
            return dp[i] = 1;
        if (s.charAt(i) == '0')
            return dp[i] = 0;

        int result = solve(i + 1, s, n);

        if (i + 1 < n) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6'))
                result += solve(i + 2, s, n);
        }

        return dp[i] = result;
    }
    public int numDecodings(String s) {
        dp = new int[101];
        Arrays.fill(dp, -1);
        int n = s.length();
        return solve(0, s, n);
    }
}
