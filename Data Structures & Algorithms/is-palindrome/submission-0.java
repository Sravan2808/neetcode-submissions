class Solution {
    private boolean isAlphaNum(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
    }
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(!isAlphaNum(s.charAt(left))) left++;
            else if(!isAlphaNum(s.charAt(right))) right--;
            else{
                if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
