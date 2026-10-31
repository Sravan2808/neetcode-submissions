class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            if(str.equals("+")){
                int first = st.pop();
                int second = st.pop();
                st.push(first+second);
            }else if(str.equals("*")){
                int first = st.pop();
                int second = st.pop();
                st.push(first*second);  
            }else if(str.equals("-")){
                int first = st.pop();
                int second = st.pop();
                st.push(second-first);
            }else if(str.equals("/")){
                int first = st.pop();
                int second = st.pop();
                st.push(second/first);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        return st.peek();
    }
}
