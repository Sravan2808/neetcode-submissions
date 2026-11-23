class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,tens=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                if(five>0){
                    tens+=1;
                    five-=1;
                }else return false;
            }
            else{
                if(five>0 && tens>0){
                    tens-=1;
                    five-=1;
                }else if(five>=3) five-=3;
                else return false;
            }
        }
        return true;
    }
}