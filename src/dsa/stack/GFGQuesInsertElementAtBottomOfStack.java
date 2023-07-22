class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int X) {
        if(st.size()==0)
        {
            st.push(X);
            return st;
        }
        int val = st.peek();
        st.pop();
        insertAtBottom(st,X);
        st.push(val);
        
        return st;
    }
}
