class Solution {
    public boolean isMonotonic(int[] A) {
        int inc = 0, dec = 0, equal = 0;
        for(int i=1; i<A.length;i++){
            int prev = A[i-1], curr = A[i];
            if(prev == curr)
                equal++;
            else if(prev<curr)
                inc++;
            else
                dec++;
        }
        if(inc>0 && dec  == 0)
            return true;
        else if(inc==0 && dec > 0)  
            return true;
        else if(equal == A.length-1)
            return true;
        else
            return false;
            
    }
    public boolean isMonotonic2(int[] A) {
	    boolean inc = true, dec = true;
	    // check increase
	    for (int i = 1; i < A.length; i++) {
		if (A[i-1] > A[i]) {
		    inc = false;
		    break;
		}  
	    }
	    // check decrease
	    for (int i = 1; i < A.length; i++) {
		if (A[i-1] < A[i]) {
		    dec = false;
		    break;
		}  
	    }        
	    return inc || dec;    
	}
}