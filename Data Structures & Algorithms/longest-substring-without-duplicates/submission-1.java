class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        int n = s.length();
        int left = 0,right = 0,maxLen = 0;

        while(right<n){
            if(hash[s.charAt(right)]!=-1){
                left = Math.max(hash[s.charAt(right)]+1,left);
            }

            maxLen = Math.max(maxLen,right-left+1);
            hash[s.charAt(right)] = right;
            right++;
        }
        return maxLen;
    }
}
