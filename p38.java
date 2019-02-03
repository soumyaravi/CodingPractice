class Solution {
    public String countAndSay(int n) {
        String res = "1";
        
        for(int i=1; i<n;i++){
            res = convertNum(res);
        }
        
        return res;
    }
    String convertNum(String res){
        StringBuilder sb = new StringBuilder();
	int count = 1, pos = 1;
	char prev = res.charAt(0);
	while(pos < res.length()){
	    if(prev == res.charAt(pos))
		count++;
	    else{
		sb.append(count);
		sb.append(prev);
		count = 1;
	    }
	    prev = res.charAt(pos);
	    pos++;
	}
	sb.append(count);
	sb.append(prev);
	return sb.toString();
    }
}