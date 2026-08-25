class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int arr:nums) map.put(arr,map.getOrDefault(arr,0)+1);
        for(int i:map.keySet())
            if(map.get(i)>1) return true;
        return false;
    }
}