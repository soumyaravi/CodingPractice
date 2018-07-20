class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st = new Stack();
        for(char ch: S.toCharArray()){
            if(ch == '#'){
                if(st.empty())
                    continue;
                st.pop();
            }
            else
                st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty())
            sb.append(st.pop());
        for(char ch: T.toCharArray()){
            if(ch == '#'){
                if(st.empty())
                    continue;
                st.pop();
            }
            else
                st.push(ch);
        }
        StringBuilder sb2 = new StringBuilder();
        while(!st.empty())
            sb2.append(st.pop());
        return sb.toString().equals(sb2.toString());
    }
}