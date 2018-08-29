class Solution {
    public String reverseString2(String s) {
        StringBuilder res = new StringBuilder(s);
        return res.reverse().toString();
    }
    public String reverseString(String s) {
        char data[] = s.toCharArray();
        int len = s.length();
        for(int i=0;i<len/2;i++){
            char temp = data[i];
            data[i] = data[len-i-1];
            data[len-i-1] = temp;
        }
        return String.copyValueOf(data);
    }
}