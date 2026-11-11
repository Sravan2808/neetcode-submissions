class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(map.containsKey(nums[i])){
                int idx = map.get(nums[i]);
                if(Math.abs(i-idx)<=k) return true;
            }
            map.put(nums[i],i);
            i++;
        }
        return false; 
    }
}