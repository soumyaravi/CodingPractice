class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                int j=i+1;
                while(s.charAt(j) >='0' && s.charAt(j) <='9')
                    j++;
                st.push("0" + s.substring(i,j));
                i=j-1;
            }
            else if(ch!=']')
                st.push(Character.toString(ch));
            else{
                StringBuilder sb = new StringBuilder();
                while(!st.empty() && st.peek().charAt(0)!='0'){
                    String data = st.pop();
                    if(!data.equals("["))
                        sb.insert(0,data);
                }
                int num = Integer.parseInt(st.pop());
                String str = sb.toString();
                for(int k=0;k<num-1;k++)
                    sb.append(str);
                st.push(sb.toString());
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.empty())
            res.insert(0,st.pop());
        return res.toString();
    }
}