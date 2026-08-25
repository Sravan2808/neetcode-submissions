class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            if(x>0) set.add(x);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i)) return i;
        }
        return 1;
    }
}