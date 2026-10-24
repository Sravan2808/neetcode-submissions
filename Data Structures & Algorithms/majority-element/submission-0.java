class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int x = 0;
        int i = 0;
        while (i < n) {
            if (cnt == 0) {
                x = nums[i];
                cnt++;
            } else if (x == nums[i]) {
                cnt++;
            }else cnt--;
            i++;
        }
        int cnt1=0;
        for(int j=0;j<n;j++){
            if(nums[j]==x) cnt1++;
        }
        if(cnt1>n/2) return x;
        return x;
    }
}