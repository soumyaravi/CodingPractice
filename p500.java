class Solution {
    public String[] findWords(String[] words) {
        String row[] = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        List<String> res = new ArrayList<>();
        for(String word:words){
            int row_index=-1;
            for(int i=0;i<3;i++){
                if(row[i].indexOf(word.charAt(0)) !=-1){
                    row_index = i;
                    break;
                }
            }
            if(checkRow(word,row[row_index]))
                res.add(word);
        }
        return res.toArray(new String[0]);
    }
    boolean checkRow(String word, String row){
        for(char ch: word.toCharArray()){
	    if(row.indexOf(ch) == -1)
		return false;
	}
        return true;
    }
}