class Solution {
    public String toGoatLatin(String S) {
        int count=1;
        StringBuilder sb = new StringBuilder();
        String words[] = S.split(" ");
        for(String word: words){
            switch(word.charAt(0)){
	    case 'A':
	    case 'E':
	    case 'I':
	    case 'O':
	    case 'U':
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':sb.append(word +"ma");
		break;
	    default:
		sb.append(word.substring(1, word.length()) + word.charAt(0) + "ma");
            }
            for(int i=0;i<count;i++)
                sb.append('a');
            count++;
            sb.append(' ');
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }
}