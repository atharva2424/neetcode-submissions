class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>  st = new Stack<>();
        for(int i = 0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                int a = st.pop();
                int b = st.pop();
                switch(tokens[i])
                {
                    case "+":
                        st.push(b+a);
                        break;
                    case "-":
                        st.push(b-a);
                        break;
                    case "*":
                        st.push(b*a);
                        break;
                    case "/":  
                        st.push(b/a);
                        break;
                }
            }
            else
                st.push(Integer.parseInt(tokens[i]));
        }
        return (int)st.pop();
    }
}
