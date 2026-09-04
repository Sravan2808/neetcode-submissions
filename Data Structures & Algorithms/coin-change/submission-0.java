class Solution {
    private int dp[][];
    private int resolve(int n,int coins[],int T){
        if(n==0){
            if(T%coins[n]==0) return T/coins[n];
            else return (int)1e9;
        }
        if(dp[n][T]!=-1) return dp[n][T];
        int not_take = 0+resolve(n-1,coins,T);
        int take = (int)1e9;
        if(coins[n]<=T) take=1+resolve(n,coins,T-coins[n]);
        return dp[n][T]=Math.min(take,not_take);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new int[n][amount+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        int ans = resolve(n-1,coins,amount);
        if(ans==(int)1e9) return -1;
        return ans;
    }
}
