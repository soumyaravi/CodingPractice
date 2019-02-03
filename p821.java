class Solution {
    public int[] shortestToChar(String S, char C) {
        int prev = -1;
        int ans[] = new int[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == C){
                prev = i;
                ans[i] = 0;
            }
            else if(prev!=-1)
                ans[i] = i-prev;
            else 
                ans[i] = Integer.MAX_VALUE;
        }
        prev = -1;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i) == C)
                prev = i;
            else if(prev!=-1)
                ans[i] = Math.min(ans[i],prev-i);
        }
        return ans;
    }
}