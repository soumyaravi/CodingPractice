class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int line = 1, rem = 100;
        for(char ch: S.toCharArray()){
            int val = widths[ch - 'a'];
            if(rem < val){
                line++;
                rem = 100;
            }
            rem-=val;
        }
        return new int[] {line, 100-rem};
    }
}