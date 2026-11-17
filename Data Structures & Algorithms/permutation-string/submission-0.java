class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        if(s1.length()>s2.length()) return false;

        for(char ch : s1.toCharArray()) freq1[ch-'a']++;

        int left = 0;
        int right = 0;
        while(right<s2.length()){
            freq2[s2.charAt(right)-'a']++;

            if(right-left+1>s1.length()){ //shrinking
            freq2[s2.charAt(left)-'a']--;
            left++;
            }

            if(right-left+1==s1.length()){
                boolean isMatch = true;
                for(int i=0;i<26;i++){
                    if(freq1[i]!=freq2[i]){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch) return true;
            }
            right++; 
        }
        return false;
    }
}
