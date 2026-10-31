class Solution {
    public int removeDuplicates(int[] nums) {
        // TreeSet<Integer> set = new TreeSet<>();
        // for(int num : nums) set.add(num);
        // int i = 0;
        // for(int num : set) nums[i++] = num;
        // return i;

// [1,1,2,3,4] -> [1,2,3,4]
        int left = 1;
        for(int right = 1;right<nums.length;right++){
            if(nums[right]!=nums[right-1]) nums[left++] = nums[right];
        }
        return left;
    }
}