class Solution {
    int[] dp;
    private int solve(int idx,int nums[]){
        if(idx==0) return nums[0];
        if(idx<0) return 0;

        if(dp[idx]!=-1) return dp[idx];

        int pick = nums[idx]+solve(idx-2,nums);
        int not_pick = solve(idx-1,nums);
        
        return dp[idx] = Math.max(pick,not_pick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(n-1,nums);
    }
}
