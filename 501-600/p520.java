class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0, small=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
                cap++;
            else 
                small++;
        }
        if(cap == 1 && word.charAt(0)>='A' && word.charAt(0)<='Z')
            return true;
        if(cap == word.length() || small == word.length())
            return true;
        return false;
    }
}