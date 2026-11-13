class Solution {
    public int trap(int[] height) {
        int sum =0;
        Stack<Integer> st = new Stack<>();
        int right[] = new int[height.length];
        for(int i = height.length-1;i>=0;i--)
        {
            if(st.isEmpty() || height[i]>st.peek())
            st.push(height[i]);
            right[i] = st.peek();
        }
        st = new Stack<>();
        int left[] = new int[height.length];
        for(int i =0;i<height.length;i++)
        {
            if(st.isEmpty() || height[i]>st.peek())
            st.push(height[i]);
            left[i] = st.peek();
        }
        for(int i =1;i<height.length-1;i++)
        {
            sum = sum + (Math.min(left[i], right[i])-height[i]);
        }
        return sum;
    }
}
