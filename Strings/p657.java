class Solution {
    public boolean judgeCircle(String moves) {
        int lr=0,ud=0;
        for(char ch: moves.toCharArray()){
            switch(ch){
	    case 'L': lr++;
		break;
	    case 'R': lr--;
		break;
	    case 'U': ud++;
		break;
	    case 'D': ud--;
		break;
            }
        }
        if(lr == 0 && ud == 0)
            return true;
        else
            return false;
    }
}