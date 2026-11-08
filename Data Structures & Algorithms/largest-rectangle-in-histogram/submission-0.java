class Solution {
    private void calculateNSL(int nsl[],int heights[]){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(!st.isEmpty()) nsl[i]=st.peek();
            st.push(i);
        }
    }
    private void calculateNSR(int nsr[],int heights[]){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(!st.isEmpty()) nsr[i] = st.peek();
            st.push(i);
        }
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsl = new int[n];
        int[] nsr = new int[n];
        for(int i=0;i<n;i++) nsl[i] = -1;
        for(int i=n-1;i>=0;i--) nsr[i] = n;

        calculateNSL(nsl,heights);
        calculateNSR(nsr,heights);

        int ans = -1;

        for(int i=0;i<n;i++){
            int height = heights[i];
            int width = nsr[i]-nsl[i]-1;
            ans = Math.max(ans,height*width);
        }
        return ans;
    }
}
