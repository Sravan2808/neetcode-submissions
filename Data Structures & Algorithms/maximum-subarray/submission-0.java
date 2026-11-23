class Solution {
    public int maxSubArray(int[] nums) {
        int largest_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            largest_sum = Math.max(sum,largest_sum);
            if(sum<0) sum=0;
        }
        return largest_sum;
    }
}
