class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            prefix = (prefix==0)?1*nums[i]:prefix*nums[i];
            suffix = (suffix==0)?1*nums[n-i-1]:suffix*nums[n-i-1];
            maxi=Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }
}
