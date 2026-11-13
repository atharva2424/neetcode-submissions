class MinStack {
    Stack<Integer> st, min;
    int minNum;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
        minNum =0;
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty())
        min.push(val);
        else
        {
            if(val<min.peek())
            min.push(val);
            else
            min.push(min.peek());
        }
    }
    
    public void pop() {
        int top = st.pop();
        int tempMin = min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
