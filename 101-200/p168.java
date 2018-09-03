class Solution {
    public String convertToTitle(int n) {
        if(n == 0)
            return "";
        else
            return convertToTitle((n-1)/26) + (char)((n-1)%26 + 'A');
    }
    public String convertToTitle2(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.insert(0,(char)((n-1)%26 + 'A'));
            n = (n-1)/26;
        }
        
        return sb.toString();
    }
}