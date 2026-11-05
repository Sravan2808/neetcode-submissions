class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length-1;
        int boats = 0;
        Arrays.sort(people);
        while(left<=right){
            if(people[right]+people[left]<=limit){
                right--;
                left++;
            }else{
                right--;
            }
            boats+=1;
        }
        return boats;
    }
}