class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
                continue;
            }
            else if(s.charAt(i)==')' && !st.empty() && st.peek() == '('){
                st.pop();
                continue;
            }
            else if(s.charAt(i)=='}' && !st.empty() && st.peek() == '{'){
                st.pop();
                continue;
            }
            else if(s.charAt(i)==']' && !st.empty() && st.peek() == '['){
                st.pop();
                continue;
            }
            else
                return false;
        }
        if(st.empty())
            return true;
        else
            return false;
    }
}