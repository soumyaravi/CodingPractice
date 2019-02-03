class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i) - 'A' + 1;
            sum += Math.pow(26,s.length() - i -1) *ch;
        }
        return sum;
    }
}