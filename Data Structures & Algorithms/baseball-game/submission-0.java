class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String ops : operations){
            if(ops.equals("+")){
                int ele = st.pop();
                int add = ele + st.peek();
                st.push(ele);
                st.push(add);
            }else if(ops.equals("D")){
                int val = st.peek();
                st.push(2*val);
            }else if(ops.equals("C")) st.pop();
            else st.push(Integer.parseInt(ops));
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}