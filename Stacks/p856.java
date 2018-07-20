class Solution {
    public int scoreOfParentheses(String S) {
        if(S.length() == 0)
            return 0;
        Stack<Integer> st = new Stack();
        int count = 0;
        for(int i=0;i<S.length();i++){
            int add=0;
            if(S.charAt(i) == '(')
                st.push(0);
            else{
                if(st.peek() == 0){
                    st.pop();
                    st.push(1);
                }
                else{
                    while(st.peek()!=0)
                        add+=st.pop();
                    st.pop();
                    st.push(2*add);
                }
            }
            
        }
        while(!st.empty())
            count+=st.pop();
        return count;
    }
}