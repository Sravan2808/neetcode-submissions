class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder ans = new StringBuilder();

        int i=0,j=0;
        while(i<m && j<n){
            ans.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }

        while(i<m) ans.append(word1.charAt(i++));

        while(j<n) ans.append(word2.charAt(j++));

        return ans.toString();
    }
}