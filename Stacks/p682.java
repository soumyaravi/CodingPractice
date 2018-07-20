class Solution {
    public int calPoints(String[] ops) {
        int total = 0;
        Stack<Integer> st = new Stack();
        for(String s: ops){
            if(s.equals("C"))
                st.pop();
            else if(s.equals("D")){
                Integer sum = st.peek() *2;
                st.push(sum);
            }
            else if(s.equals("+")){
                Integer a = st.pop();
                Integer sum = a + st.peek();
                st.push(a);
                st.push(sum);
            }
            else
                st.push(Integer.parseInt(s));
        }
        while(!st.empty()){
            total += st.pop();
        }
        return total;
    }
}