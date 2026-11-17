class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = (int)1e9;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                minLen = Math.min(right-left+1,minLen);
                sum -= nums[left];
                left++;
            }

             right++;
        }
        return minLen==(int)1e9?0:minLen;
    }
}