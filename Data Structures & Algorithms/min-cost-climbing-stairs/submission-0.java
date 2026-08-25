class Solution {
    private int solve(int idx,int cost[],int dp[]){
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int one_jump = cost[idx]+solve(idx+1,cost,dp);
        int two_jump = cost[idx]+solve(idx+2,cost,dp);
        return dp[idx] = Math.min(one_jump,two_jump);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n =  cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost,dp),solve(1,cost,dp));
    }
}
