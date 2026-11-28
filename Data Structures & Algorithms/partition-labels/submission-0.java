class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) map.put(s.charAt(i),i);

        List<Integer> ans = new ArrayList<>();
        
        int i =0;
        while(i<s.length()){
            int end = map.get(s.charAt(i));
            int j = i;
            while(j<end){
                end = Math.max(end,map.get(s.charAt(j)));
                j++;
            }
            ans.add(j-i+1);
            i=j+1;
        }
        return ans;
    }
}
