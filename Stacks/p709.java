class Solution {
    public String toLowerCase2(String str) {
        return str.toLowerCase();
    }
    public String toLowerCase(String str) {
        if(str.length() == 0)
            return "";
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch <='Z'){
                s.append((char)((ch - 'A')+97));
            }
            else
                s.append(ch);
        }
        return s.toString();
    }
}