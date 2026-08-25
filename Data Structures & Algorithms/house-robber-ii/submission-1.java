class Solution {
    private int solve(int nums[]){
        int prev2=0;
        int prev1=nums[0];
        for(int i=1;i<nums.length;i++){
        int take = nums[i];
        if(i>1) take+=prev2;
        int not_take = prev1;
        int curr = Math.max(take,not_take);
        prev2=prev1;
        prev1=curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int temp1[] = new int[n-1];
        int temp2[] = new int[n-1];

        for(int i=0;i<n;i++){
            if(i!=0) temp1[i-1]=nums[i];
            if(i!=n-1) temp2[i] = nums[i];
        }
        int ans1 = solve(temp1);
        int ans2 = solve(temp2);
        return Math.max(ans1,ans2);
    }
}
